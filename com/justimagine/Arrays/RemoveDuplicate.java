package com.justimagine.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
		
		int[] a= {10,86,20,10,86,20,60};
		
		System.out.println("Elements original array::");
		
		for(int a1:a)
		{
			System.out.print(a1+"  ");
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1,temp=0;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
//		temp[j++]=a[a.length-1];
			
			
			
		
		System.out.println("\n");
		System.out.println("Elements after the Sorting:");
		
		for(int a1:a)
		{
			System.out.print(a1+"  ");
		}
		int[] temp=new int[a.length-1];
		int j=0;
		for(int i=0;i<a.length-1;i++)	{
			
			if(a[i]!=a[i+1])
			{
				
				temp[j++]=a[i];
				
			
				
			}
		}
		
		
		
		System.out.println("\n");
		
		System.out.println("Element after removeing duplicate number:");
		for(int b1:temp)
		{
			System.out.print(b1+"  ");
		}
		
		
				
		
	}

}
