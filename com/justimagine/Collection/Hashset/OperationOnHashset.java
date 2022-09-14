package com.justimagine.Collection.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class OperationOnHashset {

	public static void main(String[] args) {
		
		
		HashSet<Integer> s1=new HashSet<Integer>();
		
		s1.add(10);
		
		s1.add(50);
		s1.add(96);
		s1.add(null);
		
		s1.add(10);
	//	System.out.println(s1.add(10));
		
		
		
		Iterator<Integer> itr = s1.iterator();

			int i=0;
			while(itr.hasNext())
			{
				
			
				System.out.println("s1["+i+"]="+itr.next());
				i++;
			}
			
			s1.remove(null);
			
			System.out.println("after removing 50");
			Iterator<Integer> itr2 = s1.iterator(); 
			i=0;
			while(itr2.hasNext())
			{
				
			
				System.out.println("s1["+i+"]="+itr2.next());
				i++;
			}
			
			s1.remove(null);
			
			System.out.println("after removing 50");
			s1.add(822);
			
			i=0;
			for(Integer s:s1)
			{
				System.out.println("s1["+i+"]="+s);
				i++;
			}
			
		
		System.out.println("size="+s1.size());
	
		for(i=1;i<19;i++)
		{
			s1.add(i);
			
		}
		System.out.println("After Addin 11  element ");
		i=0;
		for(Integer s:s1)
		{
			System.out.println("s1["+i+"]="+s);
			i++;
		}
		
		System.out.println("size="+s1.size());
		
		System.out.println("HashCode s1="+s1.hashCode());
		
	}

	
	
	
}
