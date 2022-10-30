package com.exceptions;

public class NullPointerException {

	public static void main(String[] args) {

		try {
			String str = null; //Hello World
			System.out.println(str.toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("End of main");
	}
}