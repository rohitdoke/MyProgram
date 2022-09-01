package com.justimagine.MethodOverriding;

public class DynamicDispatch {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		D d=new D();
		
		A ref;
		ref=a;
		a.show();
		
		a=new D();
		a.show();
		
		//d=new A();
		//d.show();
		
		
		/*ref=b;
		b.show();
		
		ref=d;
		d.show();
		*/

	}

}
 