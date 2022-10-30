package com.basics;

public class OverridingRuntimeAndCompiletimedispatch {

	public static void main(String[] args) {
		//If you have a reference of a super class and an object of a sub class, we can only call methods which are present in class A.
		A obj = new B(); //linking is done at runtime
		obj.show();
		//obj.config(); //Will not work 
		
		//which show method to call is also decided on the runtime
		obj = new C();
		obj.show();
	}
 }
	class A {
		public void show() {
			System.out.println("in A");
		}
	}

	class B extends A {
		public void show() {
			System.out.println("in B");
		}
	}

	class C extends A {
		public void show() {
			System.out.println("in C");
		}
		
		public void config() {
			System.out.println("in config");
		}
	}


