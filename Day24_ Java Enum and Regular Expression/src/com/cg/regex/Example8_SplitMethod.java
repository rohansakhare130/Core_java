package com.cg.regex;

import java.util.Scanner;

public class Example8_SplitMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "M21-21 --Rohan Sakhare--Ganesh";
		String[] res= str.split("--");
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}
