package com.project.flight.service;


import java.util.List;

import com.project.flight.entity.Flight;



public interface FlightService {

	public String addFlight(Flight flight);

	public String updateFlight(String id, Flight flight);

	public String deleteFlight(String id);

	public Flight findFlight(String id);

	public List<Flight> findAllFlights();

}
