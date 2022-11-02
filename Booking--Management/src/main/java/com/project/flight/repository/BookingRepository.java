package com.project.flight.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.flight.entity.Booking;



@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {

}
