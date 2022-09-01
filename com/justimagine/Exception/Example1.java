// Program to implement  nested try catch block.
//Scenario 1st " Exception occurs in outer try block "
package com.justimagine.Exception;

public class Example1 {
	
	int a=10;
	int b;
	String name=null;
	
	public void test()
	{
		try {	//outer try block
				
				System.out.println("This is outer try block");
				
				b=a/0; //exception code
				System.out.println("sum="+b);
				
			try {	//inner try block
					System.out.println("This is inner try block");
				
					System.out.println("Name:="+name.charAt(0));//Exception condition
					
				
			}catch (Exception e) {	//inner catch block
				
				System.out.println("Exception caught in inner catch block"+e);
				
			}
			
		}
		catch (Exception e1) {	//outer catch block
			
			System.out.println("Exception caught in outer catch block");
			e1.printStackTrace();
			
		}
	}
	public static void main(String[] args) {
		
		Example1 example1=new Example1();
		example1.test();
	}
	

}
