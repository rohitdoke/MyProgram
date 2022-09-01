package com.justimagine.Assignement12;

public class Account {

	
	private int accountNumber;
	private String accountName;
	
	
	
	
	
	public void setAccountDetail(int accountNumber,String accountName)
	{
			
		this.accountName=accountName;
		this.accountNumber=accountNumber;
		
		
	}
	
	
	public void getAccountInfo()
	{
		
		System.out.println("Account no:"+accountNumber);
		System.out.println("Account name:"+accountName);
	
	}
}
