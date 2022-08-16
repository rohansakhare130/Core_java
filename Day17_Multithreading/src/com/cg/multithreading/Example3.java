package com.cg.multithreading;
// Multithreading with Synchronized Block
class A
{
	void print(int num)
	{
		//Synchronized Block
		synchronized(this)
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(num*i);
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			
			}
		}
	}
}
class b extends Thread
{	
	A obj;
	b(A obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.print(10);
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		A a = new A();
		b t1= new b(a);
		b t2= new b(a);
		t1.start();
		t2.start();
		
		

	}

}
