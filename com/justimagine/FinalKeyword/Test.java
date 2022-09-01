package com.justimagine.FinalKeyword;

public final class Test {
	
	
	final int a;
	int b;
	
	Test(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void show()
	{
		System.out.println("This is fianl   Variable in show method"+a);
	
		System.out.println("This is not final Variable in show method"+b);
	}
	

	public static void main(String[] args) {
		 
		Test t1=new Test(10,45);
		
		t1.show();
		
		//t1.a=50;
		t1.b=56;
		System.out.println("This is fianl   Variable in main method"+t1.a);
		
		System.out.println("This is not final Variable in main method"+t1.b);
		

	}

}
