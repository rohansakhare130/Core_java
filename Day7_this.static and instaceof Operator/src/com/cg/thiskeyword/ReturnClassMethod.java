package com.cg.thiskeyword;
// Using Return Class Instance..
class Instance
{
	int x;
	int Id(int x)
	{
		return this.x =x;
	}
}

public class ReturnClassMethod {

	public static void main(String[] args) {
		int x=35;
		Instance I = new Instance();
		System.out.println(I.Id(x));

	}

}
