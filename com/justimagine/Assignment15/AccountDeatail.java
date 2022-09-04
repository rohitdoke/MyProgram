/*Design class AccountDetails class in which below methods. 
Public void getAccountDetails () 
public static int getWithdrawDetails(Account account) 
 
 */

package com.justimagine.Assignment15;

import java.util.Scanner;

public class AccountDeatail {
	
	public static void getWithdrawDetails(SavingAccount account,Scanner sc) 
	{
				
				System.out.println("====================================================");
				System.out.println("You Want Perform transaction ");
				
				System.out.println("Fill Login Deatil");
				
				System.out.println("Please Enter the AccountNo:=");

				int num=sc.nextInt();

				System.out.println("Please Enter an Id:=");

				int id=sc.nextInt();
				if((num==account.getAccountNumber()) && (id==account.getAccountId()))
				{	
					System.out.println("====================================================");
					System.out.println("You are  Logged into Account Successfully");
					System.out.println("====================================================");
					
					
					char ch='y';
					do
					{	
						System.out.println("Please Enter the Amount withdraw:");
						int amount=sc.nextInt();
				
							account.withdrawAmount(amount);
						
							System.out.println("you want do more transaction Press 'y'");
						
						ch=sc.next().charAt(0);
						System.out.println("=============================================");
						System.out.println("=============================================");
					}while(ch=='y');
			
				} 
				else
				{
					System.out.println("invalid ID or Account Number");
				}		
		sc.close();	
	}
	
	public static void main(String[] args) {
		System.out.println("=============================================");
		System.out.println("Welcome to Bank");
		System.out.println("=============================================");
		System.out.println("Please First Set  Regiter of Account detail:");
		
		
		Scanner sc=new Scanner(System.in);
		SavingAccount A1=new SavingAccount();
		
		System.out.println("please enter the Account number:");
		
		A1.setAccountNumber(sc.nextInt());
		
		System.out.println("please enter the Account Id:");
		
		A1.setAccountId(sc.nextInt());
		
		System.out.println("Please Enter the first Deposit Amount:");
		
		A1.setBalance(sc.nextInt());
		System.out.println("=============================================");
		System.out.println("You successfully Registered to Account");
		System.out.println("=============================================");
		
		getWithdrawDetails(A1, sc );
		
		System.out.println("You signed out from Account");
				
	}

}
