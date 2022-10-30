package com.bean;

public class  Address {
	
	private int houseNumber;
	private String streetName;
	private String city;
	private String zipCode;
	
	public Address(int houseNumber, String streetName, String city, String zipCode) {
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}
}
