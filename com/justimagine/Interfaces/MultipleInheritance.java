package com.justimagine.Interfaces;

public class MultipleInheritance implements Parent1,Parent2  {
	
	
	public void show() {
		
		System.out.println("This is Example of multiple Inheritance");
	}

	public static void main(String[] args) {
		MultipleInheritance  m=new MultipleInheritance();
		
		m.show();
		Parent1 p1;
		
		p1=m;
		p1.show();
		
		Parent2 p2;
		p2=m;
		
		p2.show();
		
		
		

	}

}
