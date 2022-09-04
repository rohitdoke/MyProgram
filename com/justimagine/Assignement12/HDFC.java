package com.justimagine.Assignement12;

public class HDFC extends Bank  {

	
	float rateOfInterest=4.5f;
	float Interest;
	
	@Override
	public void getCalculateInterest(float principleAmount, int tenure) {
		
		
		this.principleAmount=principleAmount;
		this.tenure=tenure;
		float intersetPerYear=principleAmount/rateOfInterest;
		Interest=principleAmount+(tenure*intersetPerYear);
		}
	
	public void getHDFCDetails()
	{
		
		System.out.println("Deatil of HDFCBank");
		System.out.println("Principle Amount ="+principleAmount);
		
		System.out.println("tenure="+tenure);
		System.out.println("Rate Of Interest="+rateOfInterest);
		
		System.out.println("Interest ="+Interest);
		
	}
}
