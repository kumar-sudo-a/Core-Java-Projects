package com.client;

import com.bean.Employee;

/*
public class Client {

	public static void main(String[] args) {
		
		Employee e1 = initializeEmployeeData(1, "Rahul", "1/1/2022", "Secunderabad, Telengana");
		
		displayEmployeeData(e1);
	}
	
	public static Employee initializeEmployeeData(int id, String name, String dob, String address) {
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setDob(dob);
		e.setAddress(address);
		
		return e;
	}
	
	public static void displayEmployeeData(Employee e) {
		System.out.println(e.getId() + " " + e.getName() + " " + e.getDob() + " " + e.getAddress());		
	}

}
*/

public class Client {
	
	public static void main(String[] args) {
		
		Employee e1 = initiateEmployeeData(101, "ABC", "1/1/1111", "English shallow Rd");
		
		displayEmployeeData(e1);
	
	}
	
	public static Employee initiateEmployeeData(int id, String name, String dob, String address) {
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setDob(dob);
		e.setAddress(address);
		
		return e;
	}

	public static void displayEmployeeData(Employee e) {
		System.out.println(e.getId() + " " + e.getName() + " " + e.getAddress() + " " + e.getDob());
	}
}
