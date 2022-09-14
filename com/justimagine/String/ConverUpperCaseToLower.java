package com.justimagine.String;

public class ConverUpperCaseToLower {

	public static void main(String[] args) {
		
		String str="Rohit Doke";
		String str2="";
		String str3="";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			
			
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				int ch=(int)str.charAt(i)-32;
				
					
				
				str2=str2+ (char)ch;	
			
			}
			else if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
			{	
				
					int ch=(int)str.charAt(i)+32;
				
				 	str2=str2+(char)ch;
					
			}
		}
		
		System.out.println(str2);
		//System.out.println(str3.toLowerCase());

	}

}
