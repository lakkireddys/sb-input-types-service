package com.edu.sb.input.model;

public class Address {
	
	private String place;
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String state;
	public Address(String place, String state) {
		super();
		this.place = place;
		this.state = state;
	}
	

}
