package com.justimagine.controlstatement;

public class Addition {

	
	int a;
	int b;
	int c;
	public int AddNumber(int a,int b)
	{
		
		this.a=a;
		this.b=b;
		
		c=a+b;
		
			return c;
	}
	public static void main(String[] args) {
	
		
		Addition Addition1=new Addition();
	
		int add=Addition1.AddNumber(70, 88);
		System.out.println("Addition of two nuber:="+add);
	}

}
