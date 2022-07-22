package com.cg.finalKeyword;
// final method is inherited but not override
class b
{
	final void run()
	{
		System.out.println("Hello Vaibhav");
	}
}
public class FinalMethodInherited  extends b
{

	public static void main(String[] args) {
		FinalMethodInherited f = new FinalMethodInherited();
		f.run();
	}

}
