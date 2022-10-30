package com.basics;

public class TestEnum {
	
	static public String d1 = "East";
	String d2 = "West";
	String d3 = "North";
	String d4 = "South";

	enum Directions {
		EAST, WEST, NORTH, SOUTH
	}
	
	public static void main(String[] args) {
		System.out.println(Directions.EAST);
		
		System.out.println(d1);
		//Cannot access d2 as it is not static
		//System.out.println(d2); 
	}
}
