package com.cg.freamework;

public abstract class SavingAcc extends BankAcc 
{
	private boolean isSalaried;
	static final private float MINBAL=0.0f;
	public SavingAcc(int accNo, String accNm, float accBa, boolean isSalaried) {
		super(accNo, accNm, accBa);
		this.isSalaried=isSalaried;
		
	}
	//method /Saving account
	public void withdraw (float accBa)
	{
		System.out.println("Account No is :"+this.getAccNo()+"Account Name is: "+this.getAccNm()
		+"Salaried is: "+accBa);
	}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}

}
