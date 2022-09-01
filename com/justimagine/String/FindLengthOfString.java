package com.justimagine.String;

public class FindLengthOfString {

	public static void main(String[] args) {
		//program to find length of string without using inbuilt
		
		
		String s="justimagine";
		
		
			char[] a=s.toCharArray();
			int i=0;
			try {
			
				while(a[i]!=-1)
				{
					System.out.println(a[i]);
					i++;
				}
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("This is end of the array");
			}
			System.out.println("Length of string is: "+i);
			

	}

}
