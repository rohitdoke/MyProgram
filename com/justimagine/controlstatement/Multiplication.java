package com.justimagine.controlstatement;

public class Multiplication {
	
	int a;
	int b;
	int c;
	public int getMultiplication(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a*b;
		return c;
	}

	public static void main(String[] args) {
		

		Multiplication  multi1=new Multiplication();
		
		int multi=multi1.getMultiplication(10, 42);
		
		System.out.println("Multiplication of two number is:="+multi);

	}

}
