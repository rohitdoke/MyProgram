package com.justimagine.Assignement12;

import java.util.Scanner;

public class SavingAccount extends Account {
	private String accountType;
	long balance;
	
	public void setSavingAccountDetails(String accountType,long balance)
	{
		
		
		this.accountType=accountType;
		this.balance=balance;
		
	}
	
	public void getSavingAccountInformation()
	{
		super.getAccountInfo();
		System.out.println("Saving AccoutnInformation is:");
		System.out.println("AccountType="+accountType);
		System.out.println("Balance="+balance);
		
	}
	public static void main(String[] args) {

		SavingAccount s1=new SavingAccount();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the Details");
		
		System.out.println("Please enter the Account Number");
		int accountnumber = sc.nextInt();
		System.out.println("Please Enter the AccountName:");
		String AccountName=sc.next();
		
		s1.setAccountDetail(accountnumber, AccountName);
		System.out.println("please Enter the Account Type:");
		
		String AccountType=sc.next();
		System.out.println("please Enter the Balane");
		
		long Balance=sc.nextLong();
		
		s1.setSavingAccountDetails(AccountType, Balance);
		
	
		System.out.println("Account Detail : ");
		
		s1.getSavingAccountInformation();
		
		sc.close();
	}

}
