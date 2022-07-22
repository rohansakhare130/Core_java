package com.cg.finalKeyword;

 class Vehicle 
{
	 void display()
	{
		System.out.println("Vehicle type");
		
	}
	
}
class Bike extends Vehicle
{
	final void print()
	{
		System.out.println("bike");	
	}
}



public class FinalClass {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.print();
		b.display();	

	}

}
