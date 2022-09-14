//Java Program to determine whether two strings are the anagram
package com.justimagine.String;

import java.util.Arrays;

public class check2StringAnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="rohit";
		
		String str2="rmoth";
		
		
		if(str1.length()==str2.length())
		{
		
			char[] s1=str1.toCharArray();
			char[] s2=str2.toCharArray();
			
			Arrays.sort(s1);

			Arrays.sort(s2);
			
			if(Arrays.equals(s1, s2))
			{
				
				System.out.println("Both String are anagram");
			}
			else
			{
				
					System.out.println("Both Stirng are not anagram");
				
			}
		}
		else
		{
			
				System.out.println("Both Stirng are not anagram");
			
		}
	}

}
