package com.staticModifier;

// example for static variables
public class Sample {

	// instance variable
	int var1; // non-static 
	static int var2; // static (class level- will take the latest value)

	public static void main(String[] args) {

		Sample obj1 = new Sample();
		obj1.var1 = 10;

		Sample obj2 = new Sample();
		obj2.var1 = 20;

		System.out.println(obj1.var1 + " " + obj2.var1);

		obj1.var1++;
		obj2.var1++;

		System.out.println(obj1.var1 + " " + obj2.var1);

		//Below also can be called as 
		Sample.var2 = 100;
		var2 = 100; // We are calling class level variable 
		var2 = 200;

		System.out.println(var2 + " " + var2);
		}
}	

