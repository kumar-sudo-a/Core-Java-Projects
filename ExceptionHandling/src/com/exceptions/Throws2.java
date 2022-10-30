package com.exceptions;

//using try catch to handle the exception
public class Throws2 {

	public static void main(String[] args) {
		
		int avg = calculateAverage(10,20);
		
		printAverage(avg);
	}

	private static void printAverage(int avg) {
		System.out.println(avg);	
	}

	private static int calculateAverage(int i, int j) {
		int avg = 0;
		try {
			 avg = (i + j)/0;	 
		} catch(Exception e) { 
			//Using Exception and not specific exception
			System.out.println(" somethong went wrong ");
		}
		return avg;	
	}
}

