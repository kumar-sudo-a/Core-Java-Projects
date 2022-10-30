package com.staticModifier;

public class TestStatic {

	int var1 = 10; // This code will work if static int var1 = 10;
	static int var2 = 20;
		
	public static void main(String[] args) {
		
		int num = 20;  //local variable to main method
		//System.out.println(var1); //Cannot make a static reference to the non-static field var1
		show(num);
	}
	
	public static void show(int some) { // some is  local variable of show method
		
		//System.out.println(var1 + " " + var2); //Cannot make a static reference to the non-static field var1
		TestStatic obj = new TestStatic(); 
		System.out.println(obj.var1 + " " + var2);
	}
}
// Static variables belongs to the class and not to the object(instance).
// local variables cannot be static .. why? because static are at class level variables and it has to be at instance level
// only static variables can be referenced inside a static method .. why?  because static variables do not belong to any particular instance of the class
// static variables can be referenced in both static and non-static methods .. why?

 