// Program to implement  nested try catch block.
//Scenario 2nd " Exception occurs in inner try block "
package com.justimagine.Exception;

public class Example2 {

	int a=10;
	int b;
	String name=null;
	
	public void test()
	{
		try {				//outer try block
				
				System.out.println("This is outer try block");
				
				b=a/2;	//no exception occurred
				System.out.println("sum="+b);
				
			try {		//inner try block
					System.out.println("This is inner try block");
				
					System.out.println("Name:="+name.charAt(0));//Exception occurred
					
				
			}catch (Exception e)	//inner catch block 
			{
				
				System.out.println("Exception cought in inner catch block");
				
				e.printStackTrace();
				
			}
			
		}
		catch (Exception e1) {	//outer catch block
			
			System.out.println("Exception cought in outer catch block");
			e1.printStackTrace();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example2 example2=new Example2();
		
			example2.test();
	}

}
