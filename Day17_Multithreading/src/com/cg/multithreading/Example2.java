package com.cg.multithreading;

class Test
{
	public static synchronized void display()
	{
		System.out.println("Current thread " + Thread.currentThread());
		for(int i=0; i<5; i++)
		{
			System.out.println( Thread.currentThread().getName());
			try
			{
				Thread.sleep(50);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class valueof implements Runnable
{ 
	Thread t;
	Test val;
	valueof(Test val)
	{
		this.val =val;
		t = new Thread(this);
		t.start();
	}
	
	public void run() 
	{
		val.display();
		
	}
}
public class Example2 {

	public static void main(String[] args) {
		Test obj = new Test();
		Test obj1 = new Test();
		valueof t1 = new valueof(obj);
		valueof t2 = new valueof(obj1);
	}

}
