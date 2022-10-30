package com.bean;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private Address address;
	private Gender gender;	
	
	public Employee(int id, String firstName, String lastName, Address address, Gender gender) {
		this.id =id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public Gender getGender() {
		return gender;
	}
}
