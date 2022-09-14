package com.justimagine.Java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PredicatJion {

	public static void main(String[] args) {
		
		 
		List<Integer> list=Arrays.asList(10,50,80,60,47,93,07,83);
		
		
		
		Predicate<Integer> p1=i->i>10;
		
		Predicate<Integer> p2=i->i%2==0;
		
		
		System.out.println("Print the number grater than 10");
		
		filter(p1,list);
		
		System.out.println("Print the Even number ");
		
		
		filter(p2,list);
		
		System.out.println("Print the number not grater than 10");
		
		filter(p1.negate(),list);
		
		System.out.println("Print the number grater than 10 or Even");
		filter(p1.and(p2),list);
		
		System.out.println("Print the number grater than 10 OR Even");
		
		filter(p1.or(p2),list);
		
		
 	}
	
	public static void filter(Predicate<Integer> p,List<Integer> l)
	{
	
			for(Integer i:l)
			{
				if(p.test(i))
				{
					System.out.println(i);
				}
				
			}
		
	}

}
