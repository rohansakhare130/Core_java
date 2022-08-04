package com.cg.lambda;


interface Z
{
	//Two - parameterized abstract method
	 String Display(String r , int a);
	
}
public class TwoParameterizedFunctionalInterface {

	public static void main(String[] args) {
		// Lambda Expression is ->
				Z obj = (String r , int a)->
				{
					return r + a ;
					
					
				};
				System.out.println(obj.Display("Bike Speed is",+ 25));




}
}