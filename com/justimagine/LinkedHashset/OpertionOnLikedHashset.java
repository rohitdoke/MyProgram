package com.justimagine.LinkedHashset;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ArrayList;
public class OpertionOnLikedHashset {

	public static void main(String[] args) {
		LinkedHashSet<Integer> s1=new LinkedHashSet<Integer>();
		
		
		s1.add(10);
		s1.add(50);
		
		s1.add(82);
		s1.add(80);
		s1.add(93);
		s1.add(39);
		
		Iterator<Integer> itr = s1.iterator();
	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(s1.add(93));
	}

}
