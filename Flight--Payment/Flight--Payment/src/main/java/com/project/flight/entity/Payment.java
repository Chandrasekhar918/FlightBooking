package com.project.flight.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Payment-Details")
public class Payment {
	
@Id	
	private String mobileNumber;	
	
	private  String cardno;
	private String ExpiryDetails;
	private double amount;
	
	
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Payment(String mobileNumber, String cardno, String ExpiryDetails, double amount) {
		super();
		this.mobileNumber = mobileNumber;
		this.cardno = cardno;
		this.ExpiryDetails = ExpiryDetails;
		this.amount = amount;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getCardno() {
		return cardno;
	}



	public void setCardno(String cardno) {
		this.cardno = cardno;
	}



	public String getExpiryDetails() {
		return ExpiryDetails;
	}



	public void setExpiryDetails(String ExpiryDetails) {
		ExpiryDetails = ExpiryDetails;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
