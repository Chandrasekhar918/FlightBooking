package com.project.flight.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.flight.entity.Checkin;

import com.project.flight.repository.CheckinRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CheckinServiceImpl implements CheckinService {

	@Autowired
	CheckinRepository checkinRepository;

	@Override
	public String addCheckin(Checkin checkin) {
		checkin.setChecked_in(true);
		checkinRepository.save(checkin);
		return "Successfully checked";
	}

	@Override
	public List<Checkin> findAllCheckins() {

		return checkinRepository.findAll();
	}

	@Override
	public Checkin findCheckin(String refno) {

		return checkinRepository.findById(refno).get();
	}

}
