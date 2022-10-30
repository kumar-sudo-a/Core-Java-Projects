package com;

public class Calci1 {

	public static void main(String[] args) {
		/*	// First way of writing the logic	
		int i = 10;
		int j = 20;
//		Addition
		int result = i+j;
		System.out.println(result);

//		Subtraction
		result = i-j;
		System.out.println(result);

//		Multiplication
		result = i*j;
		System.out.println(result);

//		Division
		result = i/j;
		System.out.println(result);
		 */
		// Second way of writing the logic	
		addition(10, 20);
		subtraction(10, 20);
		multiplication(10, 20);
		division(10, 20);
	}

	public static void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void subtraction(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public static void multiplication(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void division(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}
