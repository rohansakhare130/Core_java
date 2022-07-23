package com.cg.thiskeyword;
//3. this keyword can be passed as an argument in method call
class B {
	
	void print(B b)
	{
		System.out.println("Call by the function ");
	}
	void display()
	{
		print(this);// argument passing 
	}
}

public class methodCall {

	public static void main(String[] args) {
		B b = new B();
		b.display();

	}

}
