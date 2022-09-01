//program to check weather String are equal or not without using built in method
package com.justimagine.String;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
	
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the First String");
		String name=sc.next();
		
		System.out.println("Please Enter the Second String");
		String sname=sc.next();
		sc.close();
		boolean status=false;
		if(name.length()==sname.length())
		{
			
			char[] s1=name.toLowerCase().toCharArray();
			char[] s2=sname.toLowerCase().toCharArray();
			
			for(int i=0;i<s1.length;i++)
			{
				
				if(s1[i]==s2[i])
				{
					
					status=true;
					
				}
				else
				{
					break;
				}
			}
			
			
		}
		else
		{
			status=false;
			
		}

		
		if(status==true)
		{
			
			System.out.println("The Strings are Equal");
			
			System.out.println(sname+"="+name);
		}
		else
		{
		
			System.out.println("The Strings are not Equal");
			
			System.out.println(sname+"!="+name);
		}
	}

}
