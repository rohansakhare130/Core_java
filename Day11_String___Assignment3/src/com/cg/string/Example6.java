package com.cg.string;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		System.out.println(10+20+"Good"+"Moring"+10+20); // Before string the no is add 
		System.out.println(str1.concat(str2));//concat method is add to string
		s.close();
	}

}
