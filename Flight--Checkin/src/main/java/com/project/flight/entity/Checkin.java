package com.project.flight.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CheckIn-Details")
public class Checkin {
@Id
	private String refno;
	private String name;
	private  boolean checked_in= false;
	public Checkin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Checkin(String refno, String name, boolean checked_in) {
		super();
		this.refno = refno;
		this.name = name;
		this.checked_in = checked_in;
	}
	public String getRefno() {
		return refno;
	}
	public void setRefno(String refno) {
		this.refno = refno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isChecked_in() {
		return checked_in;
	}
	public void setChecked_in(boolean checked_in) {
		this.checked_in = checked_in;
	}

	
	
}
