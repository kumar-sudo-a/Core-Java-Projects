package com.client;

import com.bean.Employee;

public class Client {

	public static void main(String[] args) {
		Employee e1 = initialzeEmpoyeeData(22, "John", "Cena");
		Employee e2 = initialzeEmpoyeeData(11, "Joe", "Rogan");
		Employee e3 = initialzeEmpoyeeData(31, "Jordan", "Peterson");

		Employee[] empArr = new Employee[3];
		empArr[0] = e1;
		empArr[1] = e2;
		empArr[2] = e3;
		
		// Can be modularized instead of above 3 lines
		//Employee[] empArr = {e1, e2, e3};

		displayEmpoyeeData(empArr);
	}

	public static Employee initialzeEmpoyeeData(int id, String firstName, String lastName) {
		return new Employee(id, firstName, lastName);
	}

	public static void displayEmpoyeeData(Employee[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getId() + " " + arr[i].getFirstName() + " " + arr[i].getLastName());
		}
	}
}
