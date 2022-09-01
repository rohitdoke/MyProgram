/*Design the class as EmployeeInformation which takes the input for multiple students from user and
Design method public void getUserInput(), 
country is same for all the students
*/
package com.justimagine.AssignmentNo8;

import java.util.Scanner;

public class EmployeeInfo {
	
	String Ename;
	String Eaddress;
	String Email;
	static String  Ecountry="India";

		/*public EmployeeInfo(String name,String address,String mail)
		{
			Ename=name;
			Eaddress=address;
			Email=mail;
			
		}*/
		
		public  void getEmployeeInfo(String name,String address,String mail)
		{
			Ename=name;
			Eaddress=address;
			Email=mail;
			System.out.println("Employee Name:"+Ename);
			System.out.println("Employee Address:"+Eaddress);
			System.out.println("Employee Email:"+Email);
			System.out.println("Employee Country:"+Ecountry);
			System.out.println("==============================================");
			
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeInfo E1=new EmployeeInfo();
		
	//EmployeeInfo[] obj=new EmployeeInfo[100];
	
	 
		int i=1;
		char ch='y';
		String name;
		String address;
		String mail;
		
		do {
				
			
				
			
				if(ch=='y')
				{	
					System.out.println("Please Enter the Eployees deatail");
			
					System.out.println("Please Enter the Name:");
			
					name=sc.next();
			
			
					System.out.println("Please Enter the Address of Epmloyee:");
			
					address=sc.next();
			
					System.out.println("Please Enter the Email:");
			
					 mail=sc.next();
					 System.out.println("==============================================");
					 E1. getEmployeeInfo(name,address,mail);
					 
						
						
							
						
					 
					 
					 System.out.println(" Do you Want add Employee: Press 'Y' or not press 'N':");
					 
					 ch=sc.next().charAt(0);
					 
					 
					
					 
						
					 
				}	
				else
					{
					
						break;
					}
				
					i++;
				}while(i>0);
		
		
		
	 
	 System.out.println("Thanks for Visiting us.");
	
		
		sc.close();
		
		
	 }

	}


