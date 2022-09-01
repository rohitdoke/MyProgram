package com.justimagine.String;

public class CheckPalindromString {

	public static void main(String[] args) {
		
		String s1="Anna";
		
		
		char[] str=s1.toCharArray();
		
		int length=s1.length();
		
		
		String reverse="";
		
		for(int i=length-1;i>=0;i--)
		{
				
			reverse=reverse+str[i];
			
			
			
			
			
		}
		
		System.out.println("Given input:"+s1);
		System.out.println("Reverse ouput:"+reverse);
		
			if(s1.equalsIgnoreCase(reverse))
			{
				System.out.println("This String is palindrom");
				
			}
			else
			{
				
				System.out.println("this String is not  palindrom");
			}
		 
		
	}

}
