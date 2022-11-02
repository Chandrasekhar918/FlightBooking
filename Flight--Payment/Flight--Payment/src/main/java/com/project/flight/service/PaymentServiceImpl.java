package com.project.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.flight.entity.Payment;
import com.project.flight.repository.PaymentRepository;



import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository paymentRepository;

	public String addPayment(Payment payment) {
		paymentRepository.save(payment);
		return "payment added Successfully with MobileNumber" +  payment.getMobileNumber(); 
	}



	public Payment findPayment(String mobileNumber) {
		return paymentRepository.findById(mobileNumber).get();
	}

	public List<Payment> findAllPayments() {
		return paymentRepository.findAll();
	}

}
