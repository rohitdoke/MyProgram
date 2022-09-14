package com.justimagine.String;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="r o h i t";
		
		int len=str.length();
		String str2="";
		for(int i=0;i<len;i++)
		{
			if(!(str.charAt(i)==' '))
			{
				//str2[]=str.charAt(i);
				str2=str2+str.charAt(i);
			}
		}
		
		
			
			System.out.print("String="+str2);
		
	}

}
