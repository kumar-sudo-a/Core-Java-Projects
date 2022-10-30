package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally3 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\My Files\\Learning\\Code\\JavaG 8.18.22\\ExceptionHandling\\src\\com\\exceptions\\Test FolderSample.txt");
			Object c = new Object();
			c = fos.getClass();
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
			}	
	}
}
