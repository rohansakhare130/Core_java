package com.cg.exception;

import java.util.Scanner;

public class ArithmeticExceptionExample1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int res =15/x;
		System.out.println(res);
		s.close();
	}

}
