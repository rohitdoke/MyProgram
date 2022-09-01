package com.justimagine.ObjectClassMethod;

public class Dog implements Cloneable {
	int j;
	Cat c;
	
	Dog(int j,Cat c)
	{
		
		this.j=j;
		this.c=c;
		
	}
	
	public Object Clone() throws CloneNotSupportedException
	{
		 
		return super.clone();
	
		
	}

	
	
	
	

}
