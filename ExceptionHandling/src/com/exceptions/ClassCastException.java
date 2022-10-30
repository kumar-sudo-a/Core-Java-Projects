package com.exceptions;

public class ClassCastException {

	public static void main(String[] args) {

		
		Object o = new Object();
		String s = (String)o; // String s = new Object()
//		Above we are trying to down cast Object to String, but as the Object is a super class, RHS>LHS, it'll not work

/*Below is working code:	
		Object o = new String();
		String s = (String)o; // String s = new String()
*/
	}
}
