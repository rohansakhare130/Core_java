package com.cg.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex3 {

	public static void main(String[] args) {
		LocalDateTime myDateobj = LocalDateTime.now();
		DateTimeFormatter myFormateObj=	DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM");
		
		String formattedDate = myDateobj.format(myFormateObj);
		System.out.println(formattedDate);
	}

}
