package com.cg.abs;
// program for abstract class
abstract class Fruit
{
	//abstract method
	abstract void display();
	
}
class Apple
{
	//provide implementation for abstract method
	void display()
	{
		System.out.println("Apple is good for our brain");
	}
}



public class AbstractClass {

	public static void main(String[] args) {
		// We can't creat the obj.for abstract class
		Apple f = new Apple();
		f.display();
	}

}
