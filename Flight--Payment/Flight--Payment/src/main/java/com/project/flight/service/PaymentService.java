package com.project.flight.service;


import java.util.List;

import com.project.flight.entity.Payment;



public interface PaymentService {

	public String addPayment(Payment payment);

	
	public Payment findPayment(String MobileNumber);

	public List<Payment> findAllPayments();

}
