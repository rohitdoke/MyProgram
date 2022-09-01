package com.justimagine.com;

public class StaticMathod {
	
	public static void MethodDemo()
	{
		System.out.println("This is Static mathod");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMathod m1=new StaticMathod();
		
		
		m1.MethodDemo();    //by called using object
		
		StaticMathod.MethodDemo();
		MethodDemo();
	}

}
