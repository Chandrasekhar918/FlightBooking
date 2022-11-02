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

import com.project.flight.entity.Payment;
import com.project.flight.repository.PaymentRepository;
import com.project.flight.service.PaymentService;



@SpringBootTest
class PaymentTests {

	@Autowired
	private PaymentService paymentService;
	
	@MockBean
	private PaymentRepository paymentRepository;
	
	@Test
	@DisplayName("Add Payment Test")
	public void addPaymentTest() {
		Payment payment=new Payment("273525", "3000","76/23/1231",2022);
		when(paymentRepository.save(payment)).thenReturn(payment);
		Assertions.assertThat(payment.getCardno()).hasSizeGreaterThan(0);
	}

	
	@Test
	@DisplayName("Find all Payments Test")
	public void FindAllPaymentsTest() {
		when(paymentRepository.findAll()).thenReturn(Stream
				.of(new Payment("273535", "30450","76/23/1831",2022),new Payment("272635", "3000","76/23/1871",2722)).collect(Collectors.toList()));
				assertEquals(2, paymentService.findAllPayments().size());
	}
	
}
