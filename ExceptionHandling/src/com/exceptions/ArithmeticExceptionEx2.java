package com.exceptions;

public class ArithmeticExceptionEx2 {

	public static void main(String[] args) {
		try {
			int result = divide(100,0);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
			
		System.out.println("End of main");
	}

	public static int divide(int i, int j) {
		int result = 0;
		result = i/j;
		
		return result;
	}
}
