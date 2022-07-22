package com.cg.abs;

abstract class A 
{
	void print()
	{
		System.out.println("Non-absteract method");
	}
}
class B extends A
{
	void display()
	{
		super.print();
		System.out.println("Child class-B");
		
	}
	// As B is inheriting the properties of A class then it has print method 
}


public class NonAbstractMethod {

	public static void main(String[] args) {
		B a = new B();
		a.print();
		//a.display();

	}

}
