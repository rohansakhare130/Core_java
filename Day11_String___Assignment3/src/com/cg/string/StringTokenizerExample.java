package com.cg.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("Let's try this");
		System.out.println(st.nextToken());// next to  next char
		System.out.println(st.nextToken());

	}

}
