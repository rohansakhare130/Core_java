package com.cg.polymorphism;
//method overriding
class parent
{
	void P1()
	{
	    System.out.println("Parent - P1");	
	}
}
class ashok extends parent
{
	void P1()
	{
	    System.out.println("Child - P1");	
	}
	void P2()
	{
	    System.out.println("Child - P2");	
	}
}
public class Main 
{

	public static void main(String[] args) {
		ashok p =new ashok();
		p.P1();
		ashok c = new ashok();
		c.P2();

	}

}
