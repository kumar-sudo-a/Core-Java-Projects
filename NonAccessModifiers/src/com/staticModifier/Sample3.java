package com.staticModifier;

public class Sample3 {

	static int x;
	int y = 20;
	
	public static void main(String[] args) {
		
		System.out.println("In main");
		
		Sample3 obj = new Sample3();
		System.out.println(obj.y);
		show();
	}
	
	static {
		System.out.println("In static block");
		System.out.println("x: " + x);
	}
	
	public static void show() {
		Sample3 obj = new Sample3(); 
		// Code will not work if we remove the above line
		System.out.println(x + " " + obj.y);
		// We need to create an object to access non-static instance variable (y).
		// A copy of y will be created
		// static blocks will run first and then main method.
	}
}


