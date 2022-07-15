package com.cg.oop;
class c
{
	int rollno;
	String name;
	c(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void print()
	{
		System.out.println("Roll No is:"+rollno+"and Name is:"+name);
	}
}
public class Example3 {
     
	public static void main(String[] args) {
		c obj=new c(11,"Rohan");
		c obj1=new c(12,"Ganesh");
		obj.print();
		obj1.print();

	}

}
