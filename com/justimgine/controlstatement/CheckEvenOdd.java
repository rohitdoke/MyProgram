package com.justimgine.controlstatement;

public class CheckEvenOdd {
	
	int num;
public void getEvenOdd(int num)
{
	this.num=num;
	
	if(num%2==0)
	{
		System.out.println("This is Even number");
	}
	
	else {
		
		System.out.println("This is Odd number");
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckEvenOdd e1=new CheckEvenOdd();
		e1.getEvenOdd(0);

	}

}
