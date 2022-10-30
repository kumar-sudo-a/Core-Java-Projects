package com.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExceptionChecked {
	public static void main(String[] args) {

		String s = "09/11/2022";
		SimpleDateFormat sdf = new SimpleDateFormat("mm/DD/YYYY");			
		Date d;
		try {
			d = sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}	
		System.out.println("end of main");
	}
}
