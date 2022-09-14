//program to check weather the given string is greater than 3.
package com.justimagine.Java8Feature;
import java.util.function.Predicate;
public class CheckStringLength {

	public static void main(String[] args) {

		
		Predicate<String> p=s->(s.length()> 3);
		
		System.out.println(p.test("rohit"));

		System.out.println(p.test("ro"));
	}

}
