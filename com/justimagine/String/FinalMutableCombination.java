package com.justimagine.String;

public class FinalMutableCombination {

	public static void main(String[] args) {
		
		
		
		final StringBuilder s1=new StringBuilder("java");//declare Stringbuilder class object as final
		
		
		StringBuilder s2=s1.append("program");//performing changes on object
		
		
		System.out.println(s1);//javaprogram
		
		System.out.println(s2);//javaprogram
		
		
	/*	If reference variable declared as final then we can't perform reassignment 
	 * for the reference variable it doesn't mean we can't perform any change in that object
	 *  
	 */
	}

}
