package com.cg.enum1;
enum Bike
{
	Pulser,KTM,R15,Honda,R22
}
public class Example3 {

	public static void main(String[] args) {
		Bike b = Bike.R22;
		switch(b)
		{
		case KTM:
			System.out.println("You choose KTM");
			break;
		case Pulser:
			System.out.println("You choose Pulser");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
		case Honda:
			System.out.println("You choose Honda");
			break;
			
			default:
				System.out.println("Invaild name");
				
				
		
		
		}
		

	}

}
