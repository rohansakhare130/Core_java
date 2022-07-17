package com.cg.recursion;

import java.util.Scanner;

public class Assignment1 {
	//fun definition
	 static int fib(int n)
    { 
  	  if(n<=1)
  		  return n;
  	  return fib(n-1)+fib(n-2); // logic
    }
	 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fib(n)); // fun call
		s.close();
		
		
	}

}