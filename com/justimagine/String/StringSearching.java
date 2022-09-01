package com.justimagine.String;

public class StringSearching {

	public  static void main(String[] args) {
		
		
		
		//program to find the character in the String
		
		
		String str="rohit doke";
		int length=str.length();
		char[] a=str.toCharArray();
		char key='h';

		for(int i=0;i<length;i++)
		{
			if(a[i]==key)
			{
				
				System.out.println("a["+i+"]="+key);
			}
		}
	
	
	
	}
}
