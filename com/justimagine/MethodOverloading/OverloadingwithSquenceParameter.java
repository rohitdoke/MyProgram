package com.justimagine.MethodOverloading;

public class OverloadingwithSquenceParameter {

	public void display(int a,char b)
	{
		System.out.println("This is 1st Display Method");
		System.out.println("a="+a);
		System.out.println("Char b="+b);
	}
	public void display(char b,int a)
	{
		System.out.println("This is 1st Display Method");
		
		System.out.println("Char b="+b);
		System.out.println("a="+a);
		
	}

	public static void main(String[] args) {
		

			OverloadingwithSquenceParameter v1=new OverloadingwithSquenceParameter();
			v1.display(10,'b');
			v1.display('c',9);
			
		
		
		// TODO Auto-generated method stub

	}

}
