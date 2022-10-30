package com.finalModifier;

public class TestFinal {

	/*
	 * final is non-access modifier in Java
	 * final modifier can be user with variables, methods, classes
	 * final variables are constant and cannot be changed/reinitialized
	 * final methods cannot be overridden
	 * final class cannot be inherited or we cannot have subclasses of final class
	 */
	
	 final float pi = 3.14f;
	
	public static void main(String[] args) {
		TestFinal obj = new TestFinal();
		obj.show();
	}
	
	public void show() {
		System.out.println(pi);
	}

}
