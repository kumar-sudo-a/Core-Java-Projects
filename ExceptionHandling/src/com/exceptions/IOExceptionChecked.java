package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExceptionChecked {

	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("C:\\My Files\\Learning\\Code\\JavaG 8.18.22\\ExceptionHandling\\src\\com\\exceptions\\Test Folder\\Sample.txt");
			f.write(100);
			System.out.println("ASCII value of 100 (d) will be written");
			f.close();
		}  catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}  catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("End of main");
	}
}

