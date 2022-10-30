package com.exceptions;

//using throws to handle the exception

public class Throws3 {

	public static void main(String[] args) {
		
		int avg = 0;
		try {
			avg = calculateAverage(10,20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		printAverage(avg);
	}

	private static void printAverage(int avg) {
		System.out.println(avg);
	}

	private static int calculateAverage(int i, int j) throws Exception {
		int avg = 0;
		avg = (i + j)/0;
		return avg;
	}

	
}
