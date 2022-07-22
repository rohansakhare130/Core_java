package com.cg.finalKeyword;

 class c
{
	//We can't override any final method 
	// final void method
	void accept() {
		System.out.println("Hello sir");
		
	}
}
class D extends c
{
	void accept()
	{
		System.out.println("Restiction provived");
	}
}


public class FinalMethod {

	public static void main(String[] args) {
		D d = new D();
		d.accept();

	}

}
