package com.cg.polymorphism;
//program on method Overriding
//one class is not enough create two or more class which contains inheritance concept
class Multiplication
{
	void accept(int a, int b)
	{
	    System.out.println(a*b);	
	}
}
class Mult extends Multiplication
{
	void accept(int x, int y)
	{
	    System.out.println(x*y);	
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Mult m = new Mult();
		m.accept(12, 5);
		@SuppressWarnings("unused")
		Multiplication m1 = new Multiplication();
		m.accept(2, 15);
		
	}

}
