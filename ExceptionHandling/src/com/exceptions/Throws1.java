package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Throws1 {

	public static void main(String[] args) throws FileNotFoundException {

		writeData();
		System.out.println("End of main()");
	}

	private static void writeData() throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("C:\\My Files\\Learning\\Code\\JavaG 8.18.22\\ExceptionHandling\\src\\com\\exceptions\\Test Folder");
		System.out.println("End of writeData()");
	}
}