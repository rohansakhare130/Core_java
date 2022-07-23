package com.cg.thiskeyword;
//1 this keyword is used to refer the instance variable of current class
class firstname{
	private String str;
	private String str1;
	void  accept(String str, String str1)
	{
		this.str = str;
		this.str1 = str1;
		
	}
	void display()
	{
		System.out.println("The first String is; " +str);
		System.out.println("The Second String is; " +str1);
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		firstname f = new firstname();
		f.accept("Vaibhav", "Rohan");
		f.display();
	}

}
