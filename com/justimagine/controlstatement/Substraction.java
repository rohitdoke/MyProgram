package com.justimagine.controlstatement;

public class Substraction {

	int a;
	int b;
	int c;
	public int getSubstarction(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a-b;
		return c;
	}
	public static void main(String[] args) {
		
		
		Substraction sub1=new Substraction();
		
		int sub=sub1.getSubstarction(888, 225);
		
		System.out.println("Substraction of two number is:="+sub);
		// TODO Auto-generated method stub

	}

}
