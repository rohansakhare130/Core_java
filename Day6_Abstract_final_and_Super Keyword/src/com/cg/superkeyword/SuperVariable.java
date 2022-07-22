package com.cg.superkeyword;
//super keyword-it is used to access parent class instance variable
class Mobile
{
	//private String name ="iphone 13";
    protected String name ="iphone 13";	
}
class iphone extends Mobile
{
	String name = "Iphone SE";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);//change the visibility name to protected
		
	}
	
}

public class SuperVariable {

	public static void main(String[] args) {
		iphone i = new iphone();
		i.display();

	}

}
