package com.project.flight.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.project.flight.entity.Payment;
import com.project.flight.service.PaymentService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentControl {

	@Autowired
	PaymentService paymentService;
	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/add")
	public String addPayment(@RequestBody Payment payment) {
		return paymentService.addPayment(payment);
	}
	
	
	

	@GetMapping("/find/{mobileNumber}")
	public Payment findPayment(@PathVariable String mobileNumber) {
		
		return paymentService.findPayment(mobileNumber);
	}
	


	@GetMapping("/findall")
	public List<Payment> findAllPayments() {
		return paymentService.findAllPayments();
	}
	
}
