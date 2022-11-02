package com.project.flight.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.project.flight.entity.Flight;
import com.project.flight.repository.FlightSearchRepository;
import com.project.flight.service.FlightService;

import java.util.Arrays;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/flight")
public class FlightControl {
	@Autowired
	public FlightSearchRepository frepo;
	@Autowired
	FlightService flightService;
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/add")
	public String addFlight(@RequestBody Flight flight) {
		return flightService.addFlight(flight);
	}

	@PutMapping("/update/{id}")
	public String updateFlight(@PathVariable String id, @RequestBody Flight flight) {
		return flightService.updateFlight(id, flight);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteFlight(@PathVariable String id) {
		return flightService.deleteFlight(id);
	}

	

	@GetMapping("/find/{id}")
	public Flight findFlight(@PathVariable String id) {
		return flightService.findFlight(id);
	}

	@GetMapping("/findall")
	public List<Flight> findAllFlights() {
		return flightService.findAllFlights();
	}
@GetMapping("/find/{from_location}/{to_location}/{flightDate}")
	
	public List<Flight> getFlightByData(@PathVariable("from_location") String from_loc,@PathVariable("to_location") String to_loc,@PathVariable("flightDate") String date) throws InterruptedException{
			
		
		return frepo.findByData(from_loc, to_loc, date) ;	
		
	}

}
