package com.cg.superkeyword;
//super keyword-it is used to access parent class instance variable
class Flower
{
	Flower()
	{
		System.out.println("flower");
	}
}
class Rose extends Flower
{
     Rose()
    {
	// we are invoking parent class constructor
    	 // first give the preference to constructor call and then print the statement.
	
	super();
	System.out.println("Rose is Red");
    }
}


public class SuperConstructor {

	public static void main(String[] args) {
		Rose r = new Rose();
		
	}

}
