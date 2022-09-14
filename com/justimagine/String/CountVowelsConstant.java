package com.justimagine.String;

public class CountVowelsConstant {

	public static void main(String[] args) {
		
		
		String str="ronn47.623ainie";
		int count1=0;
		
		int count2=0;
		int count3=0;
		int count4=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				
				count1++;
			}
			else if((str.charAt(i)>='a' && str.charAt(i)<='z'))
			{
				
				count2++;
			}
			else if(str.charAt(i)>='0'&& str.charAt(i)<='9')
			{
				
				count3++;
			}
			else
			{
				count4++;
			}
		}
		
		
		System.out.println("Toatal number of Vowels ="+count1);
		System.out.println("Toatal number of Alphabate ="+(count2+count1));
		System.out.println("Toatal number of Digit ="+count3);
		System.out.println("Toatal number of Symbol ="+count4);
	}

}
