package com.cg.inter;

interface inf
{
	//by default its abstract method
	void display();
	
}
class Demo implements inf
{
	//provided the implementation for abstract method inside the Demo class
	public void display()
	{
		System.out.println("Interface");
	}
}

public class Interface1 {

	public static void main(String[] args) 
	{
		Demo d =new Demo();
		d.display();

	}

}
