package com.justimagine.AssignementNo9;

import java.util.Scanner;

public class CountObject {

	public static void main(String args[])

	{
		Scanner sc=new Scanner(System.in);
		String name;
		String address;
		long mobile;
		int count=0;
		char ch='y';
		
		
		StudentInformtion[] obj =new StudentInformtion[100];
		
		int i=1;
		do {
			System.out.println(" Do you Want add Student : Press 'Y' or not press 'N':");
				ch=sc.next().charAt(0);
				if(ch=='y') {
					
						System.out.println("please Enter the name of Student:");
						name=sc.next();
						System.out.println("Pease Enter Address of Student:");

						address=sc.next();
						System.out.println("Please Enter the Mobile Number:");
						mobile=sc.nextLong();
						obj[i]=new StudentInformtion(name,address,mobile);
						
						count++;
						i++;
					}else
					{
						break;
					}
		}while(i>0);
		
		
		
		
		System.out.println("Information of All student");
		System.out.println("==============================================");
		for(int j=1;j<=count;j++)
		{
			obj[j].display();
		}
		
		
		System.out.println("Number of Objects created by Classare:"+count);
		
		sc.close();
	}
}
