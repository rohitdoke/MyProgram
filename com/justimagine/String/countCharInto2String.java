//Java Program to count the total number of characters in a string 2
package com.justimagine.String;

public class countCharInto2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String str1="i am black fish";
		String str2="i am red fish";
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=' ')
			{	count++;
				
			}
		}
		for(int j=0;j<str2.length();j++)
		{
		
			if(str1.charAt(j)!=' ')
			{	
				count++;
			}
		}
		
	
		System.out.println("Toatal number of character:"+count);
		
		
	}

}
