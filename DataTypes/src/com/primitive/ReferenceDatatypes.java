package com.primitive;

public class ReferenceDatatypes {
	
	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		//convert string to integer.
		String str = "100";
		int val = Integer.parseInt(str);
		System.out.println(val);
		
		//find max value of two numbers
		System.out.println(Integer.max(10,20));
		
		//print ASCII value of given using Type(down) casting
		char c = 'A';
		System.out.println((int)c);
	}
}
