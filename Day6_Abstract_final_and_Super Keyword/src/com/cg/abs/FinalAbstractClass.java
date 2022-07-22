package com.cg.abs;
// we can't make any abstract class as final in java
//final abstract class car
abstract class Car
{
	abstract void display();
}
class Audi extends Car
{
	void display()
	{
		System.out.println("Most  Popular car is : Audi");
	}
}

public class FinalAbstractClass {

	public static void main(String[] args) {
		Audi a = new Audi();
		a.display();
	}

}
