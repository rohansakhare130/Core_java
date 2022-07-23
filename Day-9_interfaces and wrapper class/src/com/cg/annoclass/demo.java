package com.cg.annoclass;
//Anonymous class
abstract class Anonymus
{
	public abstract void method();
}

public class demo {

	public static void main(String[] args) {
		Anonymus s = new Anonymus()
				{
			public void method() 
			{
				System.out.println("The is example of an annonymus class");
			}
				};
				s.method();
	
	}

}
