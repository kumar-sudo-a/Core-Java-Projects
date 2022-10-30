 package com;

import java.util.Scanner;
//Scanner is an object in Java

public class PracticeMyCalculator {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number: ");
			double num1 = sc.nextDouble();
			
			System.out.println("What operation do you want to perform: (+, -, *, /)");
			char operator = sc.next().toCharArray()[0];
			
			System.out.println("Enter Second number: ");
			double num2 = sc.nextDouble();
			
			System.out.println("Here is the result: ");
			double result = 0.0;
			
			switch(operator) {
			case'+':
				result = num1 + num2;
				System.out.println(result);
				break;
			case '-' :
				result = num1 - num2;
				System.out.println(result);
				break;
			case '*' :
				result = num1 * num2;
				System.out.println(result);
				break;
			case '/' :
				result = num1 / num2;
				System.out.println(result);
				break;
			}
			
		}
		
	}
	
/*
	Reading a character using the Scanner class
Scanner class provides nextXXX() (where xxx is int, float, boolean etc) methods which are used to read various primitive datatypes. But it never provides a method to read a single character.

But, you still can read a single character using this class.

The next() method of the Scanner class returns the next token of the source in String format. This reads single characters (separated by delimiter) as a String.
String str = sc.next();
The toCharArray() method of the String class converts the current String to a character array.
char ch[] = str.toCharArray()
From the array you can get the character stored at the 0th position.
char myChar = ch[0];
 */

	/* This is another method

	public static void main(String[] args) {
		
		char operator;
	    Double number1, number2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }
	  
	  */
}

