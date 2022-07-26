package com.cg.customexception;

import java.util.Scanner;
// checked Exception
//Create an own exception
@SuppressWarnings("serial")
class NameNotFound extends Exception
{
	//constructor
	NameNotFound(String name)
	{
		super(name);
	}
}
public class CustomException 
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		try 
		{
			empname(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	
	static void empname(String str)throws NameNotFound
	{
		if(str.isEmpty())
		{
			//throwing an exception explicitly
			throw new NameNotFound("Employee-Name is empty");
		}
		else
		{
			System.out.println("Hello "+str+",");
		}
	}
}

