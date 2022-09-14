//Java Program to count the total number of characters in a string
package com.justimagine.String;

public class CountCharacterInString {

	public static void main(String[] args) {
		
		

		String str="I am good programmer";
		int count=0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
			
		}
		
		System.out.println("count of charater:"+count);
	}

}
