
//program to concatenate String without using built in function
package com.justimagine.String;



public class StringConcatination {
	
	
	
	
	
	public static void main(String[] args) {
		
		

		
			String str1="Rohit";
			
			String str2="Doke";
			
			char[] s1=str1.toCharArray();
			char[] s2=str2.toCharArray();
			
			int length1=str1.length();
			
			
			int length2=str2.length();
			
			
			int size=length1+length2;
			
			char[] s3=new char[size];
			
			
			for(int i=0;i<length1;i++)
			{
				
				
					s3[i]=s1[i];
				
			}
			
			for(int i=length1, j=0;i<size;i++,j++)
			{
			
				s3[i]=s2[j];
			}
			
			for(char c:s3)
			{
				
				System.out.print(c);
			}
			
			
	}

}
