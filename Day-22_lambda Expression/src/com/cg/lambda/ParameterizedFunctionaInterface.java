package com.cg.lambda;
//functional Interface
interface X
{
	//One - parameterized abstract method
	 String Display(String r);
	
}


public class ParameterizedFunctionaInterface {

	public static void main(String[] args) {
		// Lambda Expression is ->
		X obj = (String r)->
		{
			return r;
		};
		System.out.println(obj.Display("Lambda Expression"));

	}

}
