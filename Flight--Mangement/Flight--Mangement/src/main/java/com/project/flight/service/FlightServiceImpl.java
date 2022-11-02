package com.project.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.flight.entity.Flight;
import com.project.flight.repository.FlightRepository;



import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightRepository flightRepository;

	public String addFlight(Flight flight) {
		flightRepository.save(flight);
		return "flight added Successfully with id" +  flight.getId(); 
	}

	public String updateFlight(String id, Flight flight) {
		Optional<Flight> Container = flightRepository.findById(id);
		if (Container.isPresent()) {
			Flight n = Container.get();
			n.setId(flight.getId());
			n.setFrom_location(flight.getFrom_location());
			n.setFlightDate(flight.getFlightDate());
			n.setTo_location(flight.getTo_location());
			n.setDepature_time(flight.getDepature_time());
			n.setArrival_time(flight.getArrival_time());
			n.setAmount(flight.getAmount());
			flightRepository.save(n);
			return "Flight Updated Successfully with"+ id ;
		} else {
			return "Id not found";
		}
	}

	public String deleteFlight(String id) {
		java.util.Optional<Flight> Container = flightRepository.findById(id);
		if (Container.isPresent()) {
			Flight cust =Container.get();
			flightRepository.delete(cust);
			return " Flight Deleted Successfully"+  id;
		} else {
			return "not found";
		}
	}

	public Flight findFlight(String id) {
		return flightRepository.findById(id).get();
	}

	public List<Flight> findAllFlights() {
		return flightRepository.findAll();
	}

}
