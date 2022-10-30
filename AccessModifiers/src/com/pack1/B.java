package com.pack1;

public class B {
	
	public void showB() {
		
		A obj = new A(); // To access a class we have to create an object of the class
		System.out.println(obj.var1);
		obj.showA(); //We can also call object as it is public 
	}
}
