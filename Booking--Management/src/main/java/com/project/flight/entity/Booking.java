package com.project.flight.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BookedTicket")
public class Booking {
	
	@Id
	private String id;
	private String from;
	private String to;
	private String flightDate;
	private String userName ;
	private String contactNumber ;
	private String emailId;
	private int seatnum;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getSeatnum() {
		return seatnum;
	}
	public void setSeatnum(int seatnum) {
		this.seatnum = seatnum;
	}
	public Booking(String id, String from, String to, String flightDate, String userName, String contactNumber,
			String emailId, int seatnum) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.flightDate = flightDate;
		this.userName = userName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.seatnum = seatnum;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
