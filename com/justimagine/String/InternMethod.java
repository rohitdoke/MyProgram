package com.justimagine.String;

public class InternMethod {

	public static void main(String[] args) {
		String s1 = "pune";		
		
		String s5 = "pune";
		
		String str1 = s1.concat("1");
		
		String str2 = s5.concat("1");
		
		System.out.println(s1==s5);
		
		System.out.println(str1==str2);
		
		System.out.println(str1.intern()==str2.intern());
		
		System.out.println(str1.intern()==str2);
		
		System.out.println(str1==str2.intern());
	}

}
