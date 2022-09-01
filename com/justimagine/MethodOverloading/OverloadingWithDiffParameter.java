package com.justimagine.MethodOverloading;

public class OverloadingWithDiffParameter {
	
	
	public void show(char a)
	{
		System.out.println("This is 1st show Method");
		System.out.println(" The Number is a:"+a);
		
	}
	public void show(int a,int b)
	{	
		System.out.println("This is 2nt show Method");
		System.out.println("The number a:="+a);
		System.out.println("The number b: "+b);
	}
	public void show(float a,float b,float c )
	{
		System.out.println("This is 3rd show Method");
		System.out.println("The number a:="+a);
		System.out.println("The number b: "+b);
		System.out.println("The number c:="+c);
	}
	
	public static void main(String args[])
	{
		OverloadingWithDiffParameter v1=new  OverloadingWithDiffParameter();
		v1.show('1');
		v1.show(4, 7);
		v1.show(4.0f,4.0f,5.0f);
				
		
	}

}
