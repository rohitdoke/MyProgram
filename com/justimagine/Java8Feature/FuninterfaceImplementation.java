package com.justimagine.Java8Feature;

public class FuninterfaceImplementation 
{
	
	/*
	@Override
	public void method1(int a,int b) {
		System.out.println("a+b="+(a+b));
		
	}
	*/

	public static void main(String[] args) {
		
		 //FuninterfaceImplementation f1=new FuninterfaceImplementation();
		
		
		
	
		FunctionInterface f=(a,b)->{System.out.println("a+b="+(a+b));
									
									System.out.println("This is Lambada Expression");
										return a+b;
									};
		int sum =f.method1(10,20);

		System.out.println(sum);
	}

	
	

	
}
