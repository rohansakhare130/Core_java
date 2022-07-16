package com.cg.decisionmaking;

public class Example3 {

	public static void main(String[] args) {
		int age =15, weight=20;
		if(age>=12)
		{
			if (weight>=12) 
			{
				if(weight<=50)
				{
					System.out.println("Eligible to donate the blood");
				}
			}
			else
			{
				System.out.println("extra ropea will be added");	
			}
			
		}
		else
		{
			System.out.println("Not Eligible to donate the blood");	
		}
	}

}
