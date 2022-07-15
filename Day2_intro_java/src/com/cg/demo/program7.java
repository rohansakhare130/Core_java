package com.cg.demo;

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		String name = "Rohan Sakhare";
		double a = 12.07;
		int b = 2022;
		Scanner s = new Scanner(System.in);
		float c = s.nextFloat();
		System.out.println("Name: " + name);
		System.out.println("DD/MM: " + a);
		System.out.println("YYYY: " + b);
		System.out.println("Value of Paise: " +c);
		s.close();
	}

}
