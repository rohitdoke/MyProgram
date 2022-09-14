//program  to check weather the given number is greater than 10; 
	package com.justimagine.Java8Feature;
	
	//import java.util.*;
import java.util.function.Predicate;
public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> p=i->(i>10);
		
		System.out.println(p.test(100));
		System.out.println(p.test(0));
		
	}

}
