//Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
//Design the below method into Policy class and which return the policy object
//public Policy getPolicyDetails() 


package com.justimagine.Assignment15;

import java.util.Scanner;

public class Policy {

	
	private int policyId;
	private String polyicyName;
	private String policyType;
	private int premimumAmount;
	
	
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", polyicyName=" + polyicyName + ", policyType=" + policyType
				+ ", premimumAmount=" + premimumAmount + "]";
	}


	public static Policy getPolicyDetails() 
	
	{
		
		Policy policy1=new Policy();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id of policy");
		policy1.setPolicyId(sc.nextInt());
		
		System.out.println("Enter the Name of policy");
		policy1.setPolyicyName(sc.next());
		
		
		System.out.println("Enter the Type of policy");
		
		policy1.setPolicyType(sc.next());
		
		System.out.println("Enter the Premimum Amount of policy");
		
		
		policy1.setPremimumAmount(sc.nextInt());
		
		sc.close();

	
		return policy1;
	}


	public int getPolicyId() {
		return policyId;
	}


	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}


	public String getPolyicyName() {
		return polyicyName;
	}


	public void setPolyicyName(String polyicyName) {
		this.polyicyName = polyicyName;
	}


	public String getPolicyType() {
		return policyType;
	}


	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}


	public int getPremimumAmount() {
		return premimumAmount;
	}


	public void setPremimumAmount(int premimumAmount) {
		this.premimumAmount = premimumAmount;
	}


	public static void main(String[] args) {

		Policy p1=getPolicyDetails() ;
		System.out.println("Deatil of Policy are");
		System.out.println(p1);
		
	}
}
