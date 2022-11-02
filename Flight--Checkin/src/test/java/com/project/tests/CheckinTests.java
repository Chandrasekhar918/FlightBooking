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

import com.project.flight.entity.Checkin;
import com.project.flight.repository.CheckinRepository;
import com.project.flight.service.CheckinService;



@SpringBootTest
class CheckinTests {

	@Autowired
	private CheckinService checkinService;
	
	@MockBean
	private CheckinRepository checkinRepository;
	
	
	
	@Test
	@DisplayName("Finding all Checkin Test")
	public void FindAlLCheckinsTest() {
		when(checkinRepository.findAll()).thenReturn(Stream
				.of(new Checkin("27", "akytr",true),new Checkin("27","akytr",true)).collect(Collectors.toList()));
				assertEquals(2, checkinService.findAllCheckins().size());
	}
	
}
