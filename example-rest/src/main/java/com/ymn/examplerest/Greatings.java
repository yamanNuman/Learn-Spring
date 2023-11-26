package com.ymn.examplerest;

public class Greatings {
	
	private String greatingMessage;
	private String country;
	
	public Greatings(String greatingMessage, String country) {
		super();
		this.greatingMessage = greatingMessage;
		this.country = country;
	}

	public String getGreatingMessage() {
		return greatingMessage;
	}

	public void setGreatingMessage(String greatingMessage) {
		this.greatingMessage = greatingMessage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Greatings [greatingMessage=" + greatingMessage + ", country=" + country + "]";
	}

}
