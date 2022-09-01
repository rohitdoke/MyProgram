package com.justimagine.Inheritance;

public class DynamicDispatch {
	
	
	public static void main(String args[])
	{
		/*X x=new X();
		System.out.println(x.a);
		System.out.println(x.b);
		//System.out.println(x.c);
		x.m1();
		x.m2();
		//x.m3();
		
		
		
		Y y=new Y();
		
		System.out.println(y.a);
		System.out.println(y.b);
		System.out.println(y.c);
		
		y.m1();
		y.m2();
		y.m3();
		
		*/
		
		
		// Dynamic dispatch: passing child reference to parent
		
		X x =new Y();
		
		System.out.println(x.a);//10
		System.out.println(x.b);//20
		//System.out.println(x.c);
		
		x.m1();//This is class X method m1
		x.m2();//This is class Y method m2
		//x.m3();
		
	//	Y y=new X(); //can't pass parent class  reference to child
		
		
		
		/*
		  X x=new X();
		 
		Y y=new Y();
		
		x=y;
		System.out.println(x.a);//10
		System.out.println(x.b);//20
		//System.out.println(x.c);
		x.m1();//This is class X method m1
		x.m2();//This is class Y method m2
		//x.m3();
		*/
		
		
		
	}

}
