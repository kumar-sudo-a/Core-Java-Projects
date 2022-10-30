package com.client;

import com.bean.Employee;

public class Client {

	public static void main(String[] args) {
		Employee e1 = initialzeEmpoyeeData(22, "John", "Cena");
		Employee e2 = initialzeEmpoyeeData(11, "Joe", "Rogan");

		displayEmpoyeeData(e1);
		displayEmpoyeeData(e2);
	}

	public static Employee initialzeEmpoyeeData(int id, String firstName, String lastName) {
		Employee e = new Employee(id, firstName, lastName);
		return e;
	}
/* Modularized code for above 3 lines
	public static Employee initialzeEmpoyeeData(int id, String firstName, String lastName) {
		return new Employee(id, firstName, lastName);
		}
*/
	
	public static void displayEmpoyeeData(Employee e) {
		System.out.println(e.getId() + " " + e.getFirstName() + " " + e.getLastName());
	}
}
