package com.cg.freamework;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBa,float creditLimit )
	{
		super(accNo, accNm, accBa);
		this.creditLimit=creditLimit;
	}
	//providing implementation to abstract method of shop account here //current account
	public void withdraw (float accBa)
	{
		System.out.println("Account No is :"+this.getAccNo()+"Account Name is: "+this.getAccNm()
		+"Salaried is: "+(accBa+creditLimit));
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
}
