package com.justimagine.String;

public class CalculateOccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		
		str.toLowerCase();
		
		
		
		char[] s1=str.toCharArray();
		int length=str.length()-1;
		int count=0;
		for(int i=0;i<length;i++)
		{
				for(int j=i+1;j<length;j++)
				{
					
					if(s1[i]==s1[j])
					{
					
						System.out.println("char="+s1[i]+"\t"+count);
						count++;
						
					}
					else {
						
						
						System.out.println("char="+s1[i]+"\t"+count);
						count++;
						
					}
					
					
					
					
					
				}
			
			
		}	
			
			
		
	}

}
