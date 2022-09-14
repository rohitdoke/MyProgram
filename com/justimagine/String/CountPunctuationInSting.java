//Java Program to count the total number of punctuation characters exists in a String
package com.justimagine.String;

public class CountPunctuationInSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str=" :,rohit,jkb!/,'";
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			
			if((str.charAt(i)=='!' || str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)=='?'||
					str.charAt(i)==';'||str.charAt(i)=='\"'||str.charAt(i)=='/'||str.charAt(i)==':'))
					{
				
						count++;
					}
		}
		
		System.out.println("Total number of punctuation="+count);
	}

}
