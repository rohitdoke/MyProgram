package com.justimgine.controlstatement;

public class CheckMaxNumber {
	
	
	int a;
	int b;
	int c;
	
	public void getMaxNumber(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		if((a>b)&(a>c))
		{
		
				System.out.println("Number "+a+"is Maximumam number.");
			
		}else if((b>a)&(b>c))
		{
		
				System.out.println("Number"+b+"is Maximumam");
				
		}
		else
		{
			
			System.out.println("Number"+c+ "is Maximumam");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				CheckMaxNumber max1=new CheckMaxNumber();
				max1.getMaxNumber(45, 952, 865);
	}

}
