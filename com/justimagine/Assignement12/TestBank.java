package com.justimagine.Assignement12;

public class TestBank {

	public static void main(String[] args) {
		
		ICICBank i1=new ICICBank();
		i1.getCalculateInterest(4000, 4);
		i1.getICICIBankDetails();
		
		
		SBIBank sb=new SBIBank();
		sb.getCalculateInterest(5000, 2);
		
		sb.getSBIDetails();
		
		
		HDFC h1=new HDFC();
		
		h1.getCalculateInterest(6000, 5);
		h1.getHDFCDetails();
	
	}

}
