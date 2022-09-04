package com.justimagine.Assignement12;

public class ICICBank extends Bank{

	
	float rateOfInterest=2.5f;
	float Interest;
	
	@Override
	public void getCalculateInterest(float principleAmount, int tenure) {
		// TODO Auto-generated method stub
		
		this.principleAmount=principleAmount;
		this.tenure=tenure;
		
		float intersetPerYear=principleAmount/rateOfInterest;
		
		Interest=principleAmount+(tenure*intersetPerYear);			
	}
	public void getICICIBankDetails()
	{
		System.out.println("Deatil of ICICIBank");
		System.out.println("Principle Amount ="+principleAmount);
		
		System.out.println("tenure="+tenure);
		System.out.println("Rate Of Interest="+rateOfInterest);
		
		System.out.println("Interest ="+Interest);		
	}
}
