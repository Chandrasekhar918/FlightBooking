package com.project.flight.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.flight.entity.Flight;



@Repository
public interface FlightRepository extends MongoRepository<Flight, String> {

}
