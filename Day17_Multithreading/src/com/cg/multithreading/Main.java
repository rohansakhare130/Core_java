package com.cg.multithreading;

public class Main {

	public static void main(String[] args) {
		Thread t= new Thread();
		System.out.println("Current Thread :"+ t);
		t.setName("XYZ");
		System.out.println("Current Thread :"+ t);
		try
		{
			Thread.sleep(5);
		}
		catch (InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		
		
	}

}
