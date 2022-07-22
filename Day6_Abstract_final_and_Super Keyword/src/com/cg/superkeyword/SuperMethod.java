package com.cg.superkeyword;
//super keyword-it is used to access parent class instance variable
class Animal{
	public int a = 10,b=20;
	void display()
	{
		System.out.println("The addition of a and b is : "+(a+b));
	}
}
class Tiger extends Animal
{
	void display()
	{
		System.out.println("Tiger");
	}
	void print()
	{
		display();
		// accessing the parent class method using super keyword
		super.display();
	}
}


public class SuperMethod {

	public static void main(String[] args) 
	{
		//obj.creation
		Tiger t= new Tiger();
		t.print();
	}

}
