package com.finalModifier;

public class TestVariables {

	// instance variable
	int var1 = 30; // declaration and definition
	
	public static void main(String[] args) {
		
		// local variable
		int var2 = 40;
	}
	
	public void show() {
		System.out.println(var1);
		//System.out.println(var2); //Cannot access as it is local variable
	}

}
