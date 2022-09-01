package com.justimagine.Exception;



public class Product {
	
	String ProductName="IronBar" ;
	int weight;
	
	
	public void productCheck(int weight)throws ProductException
	{
		if(weight<100)
		{
			
			throw new ProductException(" weight of IronBar is Below 100kg");
		}
		else
		{
			
			System.out.println("Product is ready to Deliver");
		}
		
	}

	
	

}
