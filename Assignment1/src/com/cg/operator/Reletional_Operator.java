package com.cg.operator;

import java.util.Scanner;

public class Reletional_Operator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		boolean res = a>b;  //(>,<,>=,<=,!=,==)Relational_operator
		System.out.println(res);
		s.close();
		 	

	}

}
