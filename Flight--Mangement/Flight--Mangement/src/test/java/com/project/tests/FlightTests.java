package com.project.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.netflix.discovery.shared.Application;
import com.project.flight.FlightApplication;
import com.project.flight.entity.Flight;
import com.project.flight.repository.FlightRepository;
import com.project.flight.service.FlightService;



@SpringBootTest(classes = FlightApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FlightTests {

	@Autowired
	private FlightService flightService;
	
	@MockBean
	private FlightRepository flightRepository;
	
	@Test
	@DisplayName("Add Flight Test")
	public void addFlightTest() {
		Flight flight=new Flight("2","hyd","delhi","20-12-2022","18:30","24:00",2400);
		when(flightRepository.save(flight)).thenReturn(flight);
		Assertions.assertThat(flight.getId()).hasSizeGreaterThan(0);
	}

	@Test
	@DisplayName("Delete Flight Test")
	public void DeleteFlightTest() {
		Flight flight=new Flight("6","hyd","delhi","20-12-2022","18:30","24:00",2400);
		flightService.deleteFlight(flight.getId());
		assertEquals(0,flightService.findAllFlights().size());
	}
	
	@Test 
	@DisplayName("Update Flight Test")
	public void updateFlightTest() {
		Flight flight=new Flight("2","hyd","delhi","20-12-2022","18:30","24:00",2400);
		when(flightRepository.save(flight)).thenReturn(flight);
		String id=flight.getId();
		flight.setFlightDate("23-12-2022");
		flightService.updateFlight(id, flight);
		Assertions.assertThat(flight.getFlightDate().equals("23-12-2022"));
	}
	
	@Test
	@DisplayName("Find all Flights Test")
	public void FindAllFlightsTest() {
		when(flightRepository.findAll()).thenReturn(Stream
				.of(new Flight("2","hyd","delhi","20-12-2022","18:30","24:00",2400),new Flight("2","hyd","delhi","20-12-2022","18:30","24:00",2400)).collect(Collectors.toList()));
				assertEquals(2, flightService.findAllFlights().size());
	}
	
}
