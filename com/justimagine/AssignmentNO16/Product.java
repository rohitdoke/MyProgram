/*
1. Design the Product class in which design void productCheck(int weight) in check 
whether weight is less than 100, then throw the ProductException  with meaningful message. 
2. Design the ProductException class in which write custom exceptions.
3. Create MainProduct class in which pass the input to productCheck method with try and catch block.

*/

package com.justimagine.AssignmentNO16;
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
