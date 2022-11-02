package com.project.flight.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Flight-Details")
public class Flight {
	
	@Id
	private String id;
	private String from_location;
	private String to_location;
	private String flightDate;
	private String depature_time;
	private String arrival_time;
	private double amount;
		
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(String id, String from_location, String to_location, String flightDate,
			String depature_time, String arrival_time, double amount) {
		super();
		this.id = id;
		this.from_location = from_location;
		this.to_location = to_location;
		this.flightDate = flightDate;
		this.depature_time = depature_time;
		this.arrival_time = arrival_time;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFrom_location() {
		return from_location;
	}
	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}
	public String getTo_location() {
		return to_location;
	}
	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getDepature_time() {
		return depature_time;
	}
	public void setDepature_time(String depature_time) {
		this.depature_time = depature_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
