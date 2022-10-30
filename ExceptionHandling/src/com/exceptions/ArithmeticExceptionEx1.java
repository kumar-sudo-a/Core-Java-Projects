package com.exceptions;

/**
 * ArithmeticException
 * @author alwal
 *
 */
public class ArithmeticExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("You can see me");
		
		try {
			int result = 100/0;
			System.out.println(result);	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("End of main");
	}
}
