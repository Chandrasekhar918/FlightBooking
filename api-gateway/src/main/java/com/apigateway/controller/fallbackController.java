package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fallbackController {

	@GetMapping("/searchFallback")
	public String searchFallBack() {
		return "Search Service is taking longer time to respond or is down. Please try again after sometime";
		
	}
	
	@GetMapping("/paymentFallback")
	public String paymentFallBack() {
		return "Payment Service is taking longer time to respond or is down. Please try again after sometime";
		
	}
	
	@GetMapping("/bookingFallback")
	public String bookingFallBack() {
		return "Booking Service is taking longer time to respond or is down. Please try again after sometime";
		
	}
	

	@GetMapping("/checkinFallback")
	public String checkinFallBack() {
		return "Checking Service is taking longer time to respond or is down. Please try again after sometime";
		
	}
	
	
	
	
}
