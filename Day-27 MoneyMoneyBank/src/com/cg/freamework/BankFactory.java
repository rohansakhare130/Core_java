package com.cg.freamework;
//Abstract Class   
public abstract class BankFactory 
{
	//Abstract method
	abstract public SavingAcc getNewSavingAccount(int AccNo, String accNm,float accBal,boolean isSalaried);
	abstract public CurrentAcc getNewCurrentAccount(int AccNo, String accNm,float accBal,float creditLimit);
}
   