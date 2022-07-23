package com.cg.inter;
// multiple Inheritance
interface Mother
{
	void display();
}
interface Father
{
	void print();
}

class Daughter implements Mother,Father
{
	
	public void print()
	{
		System.out.println("My Father name is Suresh");
	}
	public void display()
	{
		System.out.println("My Mother name is Vaibhav");
	}
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter d =new Daughter();
		d.print();
		d.display();
	}

}
