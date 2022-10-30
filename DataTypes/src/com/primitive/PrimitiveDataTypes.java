package com.primitive;

public class PrimitiveDataTypes {
	
	byte b;
	int i;
	short s;
	long l;

	float f = 20.0f;
	double d = 100.20;
	
	boolean bool;
	
	char c = '#';
	
	public static void main(String[] args) {
		
		PrimitiveDataTypes obj = new PrimitiveDataTypes();
		System.out.println(obj.b +" "+ obj.i +" "+ obj.s +" "+ obj.l);
		//We have to create an object as we are trying to access non-static instance variable
		//If we declare as static variables we dont have to create an object.
		System.out.println(obj.f+ " "+ obj.d);
		System.out.println(obj.bool);
		System.out.println(obj.c);
	}
}
