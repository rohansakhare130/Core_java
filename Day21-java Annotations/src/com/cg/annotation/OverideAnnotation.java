package com.cg.annotation;
//@Override annotations is giving the extra information about the method
class car
{
	public void speed (int s)
	{
		System.out.println("Speed is :"+s+"km/hr");
	}
}
class BMW extends car
{
	//@Override annotation is giving the extra information about the method
	@Override
	public void speed (int str)
	{
		System.out.println("Speed is :"+str+"km/hr");
	}
}

public class OverideAnnotation 
{
	public static void main(String args[])
	{
		BMW b = new BMW();
		b.speed(50);
	}
}
