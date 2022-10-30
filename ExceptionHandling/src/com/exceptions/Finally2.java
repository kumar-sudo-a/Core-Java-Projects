package com.exceptions;

public class Finally2 {

	public static void main(String[] args) {

		int result = divide(100, 10); 
		// if 10 instead of 0, o/p: -1 End of main
		System.out.println(result);
		System.out.println("End of main");
	}

	public static int divide(int i, int j) {
		int result = 0;

		try {
			result = i / j;	
			//System.exit(0); - only scenario where finally will not be called
			return result;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			return -1;
		}
	}
}
