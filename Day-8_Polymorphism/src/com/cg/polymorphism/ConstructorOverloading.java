package com.cg.polymorphism;
//program on constructor overloading
class Audi
{
	int speed;
	String engine;
	//zero-parameter
	Audi()
	{
		System.out.println("Audi S5 Sportback");
	}
	//two parameter
	Audi(int speed,String engine)
	{
		this.speed = speed;
		this.engine = engine;
		System.out.println("Speed is:"+speed+"km/hr"+"and the engine is on:"+engine );
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Audi t = new Audi();
		Audi t1 = new Audi(50,"Disel");
		
	}

}
