package com.bean;
//Actor - Employee in this case study. It can be referred as bean/pojo/entity.

public class Employee {
	/*	
	//properties
	public int id;
	public String name;
	public String dob;
	public String address;
	//we are declaring these variables as public so that we can access them from other packages.
	//public - This is discouraged and bad practice

	//For explanation purpose - static
	public static String cname;
	 */
	private int id;
	private String name;
	private String dob;
	private String address;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public String getAddress() {
		return address;
	}
	public void setId(int id) { //id is local variable
		this.id = id; // this.id in  LHS is referring to instance variable
	}
	public void setName(String name) { 
		this.name = name;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
