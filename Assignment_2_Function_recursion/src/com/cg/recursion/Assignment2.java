/*2)sum of digits
Write a program to find the sum of digits in a number using recursion.*/


package com.cg.recursion;

import java.util.Scanner;

public class Assignment2 {
	//fun definition
	 static int sumOfno(int n)
   { 
 	  if(n<=1)
 		  return n;
 	  return (n%10+sumOfno(n/10)); // logic
   }
	 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfno(n)); // fun call
		s.close();
		
		
	}

}
