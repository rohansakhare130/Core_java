package com.cg.lambda;
//functional interface
interface C
{
	int add (int a, int b);
	
}
interface D
{
	
	String show (String str1,String str2 );
}

 
public class LambdaExp {

	public static void main(String[] args) {
		// lambda expression without returning a Value
		C obj = (int a, int b)->(a*b); // using integer
		D obj1 = (String x,String y )->(x+y); // using String
		System.out.println("Multiplication of A and B is :" +obj.add(12, 5));
		   
		System.out.println("Strings are  :" +obj1.show("Rohan"," "+ "Sakhare"));

	}

}
