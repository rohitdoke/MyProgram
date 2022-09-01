package com.justimagine.String;

final public class ImmutableClass {
	
	int i;
	
	
	

	public ImmutableClass(int i) {
		
		this.i = i;
	}


public ImmutableClass Immutable(int i)
{
	
		if(this.i==i)
		{
			
			
			return this;
		}
		else
		{
			
			return(new ImmutableClass(i));
		}


}

	public static void main(String[] args) {
		
		
		ImmutableClass class1=new ImmutableClass(10);
		
		ImmutableClass class2=class1.Immutable(100);//false
		
		ImmutableClass class3=class1.Immutable(10);//
		
		System.out.println(class1==class2);//false
		
		System.out.println(class1==class3);//true
		System.out.println(class2==class3);//false
	}

}
