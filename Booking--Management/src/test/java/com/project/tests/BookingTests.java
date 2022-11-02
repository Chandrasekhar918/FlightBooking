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

import com.project.flight.entity.Booking;
import com.project.flight.repository.BookingRepository;
import com.project.flight.service.BookingService;



@SpringBootTest
class BookingTests {

	@Autowired
	private BookingService bookingService;
	
	@MockBean
	private BookingRepository bookingRepository;
	
	@Test
	@DisplayName("Add Booking Test")
	public void addFlightTest() {
		Booking booking=new Booking("1", "kakinada","banglore","19-12-2022","arun","7093839328","ak450@gmail.com",9);
		when(bookingRepository.save(booking)).thenReturn(booking);
		Assertions.assertThat(booking.getId()).hasSizeGreaterThan(0);
	}

	@Test
	@DisplayName("Delete Booking Test")
	public void DeleteFlightTest() {
		Booking booking=new Booking("1", "kakinada","mumbai","29-11-2022","chandu","796352698","chandu450@gmail.com",10);
		bookingService.deleteBooking(booking.getId());
		assertEquals(0,bookingService.findAllBookings().size());
	}
	
	@Test 
	@DisplayName("Update Booking Test")
	public void updateFlightTest() {
		Booking booking=new Booking("1", "rajamundry","banglore","08-02-2022","noushin","7093839228","noushin450@gmail.com",11);
		
		when(bookingRepository.save(booking)).thenReturn(booking);
		String id=booking.getId();
		booking.setUserName("sahid");
		bookingService.updateBooking(id, booking);
		Assertions.assertThat(booking.getUserName().equals("sahid"));
	}
	
	@Test
	 @DisplayName("Find all Bookings Test")
	 public void FindAllBookingssTest() {
		when(bookingRepository.findAll()).thenReturn(Stream
				.of(new Booking("1", "kakinada","banglore","19-12-2022","arun","7093839328","ak450@gmail.com",9),new Booking("1", "rajamundry","banglore","08-02-2022","noushin","7093839228","noushin450@gmail.com",11)).collect(Collectors.toList()));
				assertEquals(2, bookingService.findAllBookings().size());
	}
	
}
