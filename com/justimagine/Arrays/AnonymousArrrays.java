package com.justimagine.Arrays;

public class AnonymousArrrays {
	
	
	
	public void printValues(int[] a)// passing arguments
	{
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);	
		}
	}

	
	public static void main(String...args) {
		
		
		
		
		AnonymousArrrays a=new AnonymousArrrays();
		
		
		
			
		a.printValues(new int[]{10,20,30,40});
		

	}

}
