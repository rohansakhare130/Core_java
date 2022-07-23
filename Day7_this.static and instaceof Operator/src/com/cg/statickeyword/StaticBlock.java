package com.cg.statickeyword;

public class StaticBlock {
	
	static int num;
	static String str;
	// static block: if u want to initialize the value without using constructor and obj.creation
	
     /* and make the variable of the class as static
	static 
	{
		num =15;
		str="Vaibhav";
	} */
	
	
	// static block: if u want to initialize the value without using constructor and obj.creation
		//then use static block
	StaticBlock()
	{
		num =15;
		str="Rohan"; 
	}

	public static void main(String[] args) {
		StaticBlock s = new StaticBlock();
		System.out.println(s.num);
		System.out.println(s.str);
		//System.out.println(num);
		//System.out.println(str);
	}

}
