package com.cg.freamework;

public abstract class BankAcc
{
	private int AccNo; 
	private String accNm;
	private float accBa;
	
	//constructor
	public BankAcc(int accNo, String accNm, float accBa) {
		super();
		this.AccNo = accNo;
		this.accNm = accNm;
		this.accBa = accBa;
	}
	//getters and setter method for private variable
	public int getAccNo() {
		return AccNo;
	}
	//abstract method withdraw
	abstract public void withdraw(float accBal);
	public void deposite(int accNo, String accNm, float accBa)
	{
		System.out.println(accNo+accNm+accBa);
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBa() {
		return accBa;
	}
	public void setAccBa(float accBa) {
		this.accBa = accBa;
	}
	//toStringMethod
	@Override
	public String toString() {
		return String.format("BankAcc [AccNo=%s, accNm=%s, accBa=%s]", AccNo, accNm, accBa);
	}

	
}
