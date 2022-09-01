//Design the Employee class which contain firstName, lastName, city and mobileNumber and  country.
package com.justimagine.AssignmentNo8;

import java.util.Scanner;

public class EmployeeDetail {

	String firstName;
	String lastName;
	String city;
	long mobileNumber;
	String country;
	
		public EmployeeDetail(String fName,String lName,String eCity,long mobileNum,String eCountry)
		{
			firstName=fName;
			lastName=lName;
			city=eCity;
			mobileNumber=mobileNum;
			country=eCountry;
			
			
			
		}
		
		public void getEmployeeDetail()
		{
			System.out.println("Deatil of Employee:");
			System.out.println("FristName:"+firstName);
			System.out.println("LastName:"+lastName);
			System.out.println("City:"+city);
			System.out.println("MobileNumber:"+mobileNumber);
			System.out.println("Country:"+country);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the First name:");
		
		String fName=sc.next();
		System.out.println("Please Enter the Last name:");
		
		String lName=sc.next();
		
		System.out.println("Please Enter the City of Epmloyee:");
		
		String eCity=sc.next();
		
		System.out.println("Please Enter the Mobile number:");
		
		long mobileNum=sc.nextLong();
		
		System.out.println("Please Enter the Country of Employee:");
		
		String eCountry=sc.next();
	
		EmployeeDetail E1=new EmployeeDetail(fName,lName,eCity,mobileNum,eCountry);
		
		E1.getEmployeeDetail();
		
		sc.close();
	}

}
