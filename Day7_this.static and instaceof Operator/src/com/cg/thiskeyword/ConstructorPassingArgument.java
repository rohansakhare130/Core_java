package com.cg.thiskeyword;
 class arg
{
	int A,B;
	public void setdata(int A,int B)
	{
		this.A = A;
		this.B = B;
	}

 public void no() 
 {
	System.out.println("Value of A = " +A);
	System.out.println("Value of B = " +B);
 }
	 
 }
 
public class ConstructorPassingArgument {

	public static void main(String[] args) {
		arg obj = new arg();
		obj.setdata(15,30);
		obj.no();
		
	}

}
