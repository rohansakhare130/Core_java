package com.cg.regex;
//pattern class

import java.util.Scanner;
import java.util.regex.Pattern;
public class Example6 {

	public static void main(String[] args) {
		String pattern="Rohan Sakhare";
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		boolean result= Pattern.matches(pattern, input);
		System.out.println(result);
		s.close();
		
	}

}
