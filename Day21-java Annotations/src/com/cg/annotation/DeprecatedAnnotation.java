package com.cg.annotation;

class A
{
	//it allows any elements no longer to be used
	@Deprecated
	public void print()
	{
		System.out.print("Welcome to the C2TC Program");
	}
}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		A a = new A();
		a.print();
	}

}
