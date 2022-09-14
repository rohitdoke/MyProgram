package com.justimagine.AssignmentNO17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountsNumVowels {
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br=new BufferedReader(new FileReader("D:\\Velocity java\\Collection\\stirngcount.txt"));
		
		int countnum=0;
		int countvowel=0;
		
		String str=br.readLine();
		while(str!=null)
		{
					
			for(int i=0;i<str.length();i++)
			{	
				
				if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'|| str.charAt(i)=='u'||
						str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'||str.charAt(i)=='O'|| str.charAt(i)=='U'	)
				{
				 countvowel++;
				}
				else if (str.charAt(i)>='0'&& str.charAt(i)<='9')
				{
			
					countnum++;	
				}
			
			}
			
			str=br.readLine();
		 }
		br.close();
	System.out.println("Number of vowels present in the file are:="+countvowel);
	System.out.println("Number of number present in the file are:="+countnum);
	}

}
