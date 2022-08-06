package com.cg.enum1;

public class Example2 
{
	enum Name
	{
		Rohan,Shivani,Ganesh,Vaibhav;
	}
	public static void main(String[] args) {
		int count=11;
		for (Name n:Name.values())
		{
			System.out.printf("Name:%d = %s\n ",count++,n);
		}

	}
}
