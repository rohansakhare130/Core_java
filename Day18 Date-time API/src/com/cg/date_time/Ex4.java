package com.cg.date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex4 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plusDays(100);
		 
		long diffInDays = ChronoUnit.DAYS.between(date1, date2);
		System.out.println(diffInDays);

	}

}
