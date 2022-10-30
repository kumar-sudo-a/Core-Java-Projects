package com.staticModifier;

public class Sample3 {

	static int x;
	int y = 20;

	static {
		System.out.println("In static block");
		System.out.println("x: " + x);
	}
	
	public static void main(String[] args) {
		
		System.out.println("In main");
		
		Sample3 obj = new Sample3();
		System.out.println(obj.y);
		
		obj.show();

	}
	
	public static void show() {
		System.out.println(x + " " + y);
	}
}


