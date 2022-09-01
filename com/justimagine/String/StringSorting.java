//program to sorting String without using built in function.
package com.justimagine.String;

public class StringSorting {

	public static void main(String[] args) {
		
		
		
		
		//sorting String Ascending order 
		
			char temp = 0;
			
			
			String str1="mahashtra";
			
			char[] a1=str1.toCharArray();
			int size=str1.length();
			System.out.println("Given String is:"+str1);
			for(int i=0;i<size;i++)
			{
				
				for(int j=i+1;j<size;j++)
				{
						if((a1[i]>a1[j]))
						{
							temp=a1[i];
						
							a1[i]=a1[j];
							a1[j]=temp;
						}
				}
			}
			
			
		
			System.out.println("\nString after Sorting: ");
			for(char c1:a1)
			{
				
				System.out.print(c1);
			}
		
	}

}
