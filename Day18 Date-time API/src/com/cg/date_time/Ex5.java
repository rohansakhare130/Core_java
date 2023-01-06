package com.cg.date_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Ex5 {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("Egypt"));
		LocalDateTime t1=LocalDateTime.now(ZoneId.of("Egypt"));
		System.out.println(t);
		System.out.println(t1);
		for(String s: ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}

	}

}
