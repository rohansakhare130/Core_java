package com.cg.freamework;

public abstract class NormalAcc extends ShopAcc 
{
	private final float deliverycharges;
	public NormalAcc(int accNo, String accNm, float charges,float deliverycharges) {
		super(accNo, accNm, charges);
		this.deliverycharges=deliverycharges;
		
	}
	//providing implementation to abstract method of shop account here //normal account
	public void bookProduct(float charges)
	{
		System.out.println("Account No is : "+this.getAccNo()+"Account Name is: "+this.getAccNm()
		+"Charges is: " +(charges+deliverycharges));
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliverycharges=%s]", deliverycharges);
	}
	

}
