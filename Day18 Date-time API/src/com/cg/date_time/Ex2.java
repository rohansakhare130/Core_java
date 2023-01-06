package com.cg.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex2 {

	public static void main(String[] args) {
		String dateString = "2022-08-20 11:30";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);

		System.out.println(parsedDateTime);	
 
	}

}
