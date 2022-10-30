package com.client;

import com.bean.Address;
import com.bean.Employee;
import com.bean.Gender;

public class Client {

	public static void main(String[] args) {
		Employee e1 = initialzeEmpoyeeData(22, "John", "Cena", 1360, "French Shallow Rd", "FL", "36958", Gender.MALE);
		Employee e2 = initialzeEmpoyeeData(11, "Joe", "Rogan", 3345, "Falling View Lane", "NY", "74152", Gender.MALE);
		Employee e3 = initialzeEmpoyeeData(31, "Jordan", "Peterson", 9905, "Sunshine Boulevard", "CA", "65869", Gender.MALE);
		Employee e4 = initialzeEmpoyeeData(1, "Mother", "Theressa", 3-115, "Live in peace Street", "Calcutta", "26214", Gender.FEMALE);
 
		Employee[] empArr = {e1, e2, e3, e4};

		displayEmpoyeeData(empArr);
	}

	public static Employee initialzeEmpoyeeData(int id, String firstName, String lastName, int houseNumber, String streetName, String city, String zipCode, Gender gender) {		
		Address a = new Address(houseNumber, streetName, city, zipCode);
		Employee e = new Employee(id, firstName, lastName, a, gender);
		return e;
//		Above 3 lines can be modularized to below one line.
//		return new Employee(id, firstName, lastName, new Address(houseNumber, streetName, city, zipCode));

	}

	public static void displayEmpoyeeData(Employee[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getId() + " " + arr[i].getFirstName() + " " + arr[i].getLastName() + " " + arr[i].getAddress().getHouseNumber() + ", " + arr[i].getAddress().getStreetName() + ", " + arr[i].getAddress().getCity() + ", " + arr[i].getAddress().getZipCode() + ", " + arr[i].getGender());
			System.out.println("\n");
		}
	}
}
