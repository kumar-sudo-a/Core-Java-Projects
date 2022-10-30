package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileNotFoundExceptionChecked {

	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("C:\\My Files\\Learning\\Code\\JavaG 8.18.22\\ExceptionHandling\\src\\com\\exceptions\\Test Folder\\Sample.txt");
			System.out.println("A new file will be created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of main");
	}
}


