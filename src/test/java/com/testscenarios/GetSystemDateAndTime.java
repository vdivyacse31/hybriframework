package com.testscenarios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetSystemDateAndTime {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);//Mon Oct 27 20:00:56 MDT 2025
		//ddMMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		//Convert date into dateformat
		String timestamp = df.format(d);
		System.out.println(timestamp);//27Oct2025_200056
		
		
		


	}

}
