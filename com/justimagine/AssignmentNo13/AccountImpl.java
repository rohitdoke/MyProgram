package com.justimagine.AssignmentNo13;

import java.util.Scanner;

public class AccountImpl implements Account {

	private String name;
	private float balance;

	@Override
	public void getSavingAccount() {
		// TODO Auto-generated method stub
		System.out.println("Account Detail ");
		
		System.out.println("Name="+name);
		System.out.println("Balance="+balance);
		
		
	}

	@Override
	public void getUserDetails(String name, float balance) {
		// TODO Auto-generated method stub
		
		
		this.name=name;
		
		this.balance=balance;
	}
	
	public static void main(String[] args) {
		Account a1=new AccountImpl();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the name:");
		String name=sc.next();
		
		System.out.println("Please Enter the Balance");
		float balance=sc.nextFloat();
		
		
		
		a1.getUserDetails(name, balance);
		
		
		a1.getSavingAccount();
		sc.close();
	}

	
	
	
	
}
