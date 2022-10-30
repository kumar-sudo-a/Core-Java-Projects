package com.exceptions;

import java.io.File;

public class ExampleToGetNameAndAbsolutePathOfAFile {

	public static void main(String[] args) {
		File f = new File("C:\\My Files\\Learning\\Code\\JavaG 8.18.22\\ExceptionHandling\\src\\com\\exceptions\\Test Folder");
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
	}
}
