package com.exceptions;

public class Finally1 {

	public static void main(String[] args) {

		// Compile time
		System.out.println("Hello World");

		try {
			int result = 100 / 0;
			System.out.println(result);
		} finally {
			System.out.println("In finally block");
		}

		System.out.println("End of main");
	}
}