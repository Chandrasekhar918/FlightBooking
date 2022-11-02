package com.project.flight.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.flight.entity.Checkin;




@Repository
public interface CheckinRepository extends MongoRepository<Checkin, String> {


	

}
