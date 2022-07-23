package com.cg.polymorphism;
// method overloading concept
class A 
{
	//by having the different types of arguments
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(float a, float b)
	{
		System.out.println(a+b);
	}
}


public class MethodOverloading1 {

	public static void main(String[] args) {
		A obj =new A();
		obj.add(2, 5);
		obj.add(3.1f, 4.1f);

	}

}
