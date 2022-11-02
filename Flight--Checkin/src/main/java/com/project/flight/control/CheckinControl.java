package com.project.flight.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.project.flight.entity.Checkin;

import com.project.flight.repository.CheckinRepository;
import com.project.flight.service.CheckinService;


@RestController
@RequestMapping("/checkin")
public class CheckinControl {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CheckinService checkinService;

	@PostMapping("/addcheckin")
	public String addCheckin(@RequestBody Checkin checkin) {
		return checkinService.addCheckin(checkin);
	}

	@GetMapping("/find/{refno}")
	public Checkin findCheckin(@PathVariable String refno) {
		return checkinService.findCheckin(refno);
	}

	@GetMapping("/findallcheckin")
	public List<Checkin> findAllCheckins() {
		return checkinService.findAllCheckins();
	}

}
