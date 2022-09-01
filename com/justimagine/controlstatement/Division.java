package com.justimagine.controlstatement;

public class Division {

	int a;
	int b;
	float c;
	public float getDivison(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a/b;
		return c;
	}

	public static void main(String[] args) {
		

		Division  divison1=new Division();
		
		float div=divison1.getDivison(100, 5);
		
		System.out.println("Divioson of two number is:="+div);

	}


}
