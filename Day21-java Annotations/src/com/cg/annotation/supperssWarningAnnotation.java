package com.cg.annotation;

class bike
{
	//Non-Parameterized Constructor
	  bike()
	{
		System.out.println("Speed is 40 km/hr");
	}
}

public class supperssWarningAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		bike b = new bike();
		
	}

}
