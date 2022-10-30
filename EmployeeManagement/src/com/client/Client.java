package com.client;

import com.bean.Employee;

public class Client {

	public static void main(String[] args) {
		/*	
		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "Johny";
		e1.dob = "02/05/2020";
		e1.address = "Old Mirjalguda";

		//For explanation purpose - static
		//we can directly call this variable using the class name as it is static
		Employee.cname = "ABC";

		System.out.println(e1.getId() +" "+e1.name+" "+e1.dob+" "+e1.address);
		 */

		/*
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("John Doe");
		e1.setAddress("123, Falling View Lane, GA");
		e1.setDob("09/12/1990");
		System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getAddress() + " " + e1.getDob());

		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("John Joe");
		e2.setAddress("122, Falling View Lane, NY");
		e2.setDob("09/12/1992");
		System.out.println(e2.getId() + " " + e2.getName() + " " + e2.getAddress() + " " + e2.getDob()); 
		 */

		/*
		Client client = new Client();
 
		Employee e1 = new Employee(); //created a blank object 
		client.initilaizeEmployeeData(e1);		
	}

		public void initilaizeEmployeeData(Employee emp) { //Passing the reference(emp) of blank Employee object to this method
			//e1 is getting copied to emp
			//One object multiple copies
			//One more reference emp is getting created to the same object e1. 
			//This is known as passing reference or pass by reference.
			emp.setId(101);
			emp.setName("Jesus");
			emp.setDob("0/0/0000");
			emp.setAddress("000 Everywhere, Heaven Lane");
		}
		 */
		Employee e1 = initilaizeEmployeeData(101, "Jesus", "0/0/0000", "000 Everywhere, Heaven Lane" );
		Employee e2 = initilaizeEmployeeData(102, "Baba", "0/0/0000", "000 Everywhere, Swargam District" );

		displayEmployeeData(e1);
		displayEmployeeData(e2);
	}

/**
 * Initialize employee data
 * @param id
 * @param name
 * @param dob
 * @param ad
 * @return
 */
	public static Employee initilaizeEmployeeData(int id, String name, String dob, String ad) { //Passing the reference(emp) of blank Employee object to this method
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setDob(dob);
		e.setAddress(ad);
		
		return e;
	}
	
	/**
	 * Display employee data
	 * @param e
	 */
	public static void displayEmployeeData(Employee e) {
		System.out.println(e.getId() + " " + e.getName() + " " + e.getAddress() + " " + e.getDob());
	}
}
