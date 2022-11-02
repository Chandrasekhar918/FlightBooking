package com.project.flight.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.flight.entity.Flight;



	
	@Repository
	public interface FlightSearchRepository extends MongoRepository<Flight,String> {
		@Query("{'from_location' : :#{#from_location}, 'to_location' : :#{#to_location},  'flightDate' : :#{#flightDate}   } ")
		List<Flight> findByData(@Param("from_location") String from_location, @Param("to_location") String to_location,@Param("flightDate") String flightDate);

	}

