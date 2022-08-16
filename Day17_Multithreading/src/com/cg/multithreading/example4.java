package com.cg.multithreading;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.print("Thread interruption");
	}
}
public class example4 {

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
		t.interrupt();
	}

}

// note : when thread is interrupted?
  //    = thread is sleeping and wating this time thread is interrupted.