package com.justimagine.com;

public class ScopeOfStaticMethod {

	
	int a=10;
	static int b=20;
	
	
		public static void demo()
		{
			
			//System.out.println("Value of a in Static Method:="+a);
			System.out.println("Value of b in Static Method:="+b);
			
		}
		public void demo1()
		{
			System.out.println("Value of a in Normal method:="+a);
		
			System.out.println("Value of b in Normal Method:="+b);
			a++;
			b++;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ScopeOfStaticMethod S=new ScopeOfStaticMethod();
		S.demo1();
		ScopeOfStaticMethod S1=new ScopeOfStaticMethod();
		
		
		S1.demo1();
		
		
		
		//ScopeOfStaticMethod.demo();
		
	}

}
