package com.project.flight.service;

import java.util.List;

import com.project.flight.entity.Checkin;



public interface CheckinService {

	public String addCheckin(Checkin checkin);


	public List<Checkin> findAllCheckins();




	public Checkin findCheckin(String refno);

	

}