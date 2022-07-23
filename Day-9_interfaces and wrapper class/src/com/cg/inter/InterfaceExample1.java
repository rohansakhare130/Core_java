package com.cg.inter;

public interface InterfaceExample1 {
	//by default its abstract method
	void display();

}
class X implements InterfaceExample1
{
	//provided the implementation for abstract method inside the demo class
	public void display()
	{
		System.out.println("InterfaceExample1");
	}
}
