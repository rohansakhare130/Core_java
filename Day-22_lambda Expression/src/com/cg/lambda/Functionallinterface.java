package com.cg.lambda;
//functional Interface
interface A
{
	//Zero - parameter abstract method
	void show();
	
}
/*class B implements A
{
	@Override
	public void show()
	{
		System.out.println("Program on to implement Function interface using lambda expression");
	}
}*/
public class Functionallinterface {

	public static void main(String[] args) {
		//B b = new b();
		//b.show();
		A obj=()-> // Lambda Expression [->]
		{
			System.out.println("Program on to implement Function interface using lambda expression");
		};
		obj.show();
	}

}
