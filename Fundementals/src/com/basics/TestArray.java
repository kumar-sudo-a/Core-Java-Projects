package com.basics;

public class TestArray {

	public static void main(String[] args) {

		String[] mySubjectsArray = new String[4];
		mySubjectsArray[0] = "Java";
		mySubjectsArray[1] = "Maths";
		mySubjectsArray[2] = "Physics";
		mySubjectsArray[3] = "General Knowledge";
		
		for (int i = 0; i < mySubjectsArray.length; i++) {
			System.out.println(mySubjectsArray[i]);
		}
	}

}
