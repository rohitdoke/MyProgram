// Program to implement  nested try catch block.
//Scenario 3rd " Exception should be occurs in inner try block and handled inside outer catch block  "
package com.justimagine.Exception;

public class Example3 {
	
	int a=10;
	int b;
	String name=null;
	
	public void test()
	{
		try {	//outer try block
				
				System.out.println("This is outer try block");
				
				b=a/2; //no Exception occurred
				System.out.println("Sum="+b);
				
				try { // inner try block
						System.out.println("Exception occurred in  inner try block");
				
						System.out.println("Name:="+name.charAt(0));
					
					}
					catch (ArithmeticException e1) //1st inner catch block
					{
				
						System.out.println("This is 1st inner catch block");
				
						e1.printStackTrace();
				
					}
					catch(ArrayIndexOutOfBoundsException e2)//2nd inner catch block
					{
						System.out.println("This is 2nd inner catch block");
						e2.printStackTrace();
					}
			
		}catch (NullPointerException e3) {	//1st outer catch block
			System.out.println("This Exception caught in 1st outer  catch block");
			e3.printStackTrace();
		}
		
		catch (Exception e4) {		// 2nd outer catch block
			
			System.out.println("This Exception cought 2nd outer parent Exception class in catch block");
			e4.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		
		Example3 example3=new Example3();
		
		example3.test();
		
	}

}
