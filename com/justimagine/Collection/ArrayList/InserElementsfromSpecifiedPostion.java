package com.justimagine.Collection.ArrayList;
import java.util.*;
public class InserElementsfromSpecifiedPostion {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<String>();
		
		
		l1.add("rohit");
		
		l1.add("sono");
		l1.add("ganu");
		l1.add("rano");
		l1.add("sumo");
		
		System.out.println("First List");
		int i=0;
		for(String l:l1)
		{
			
			System.out.print("List1["+i+"]="+l+"   ");
			i++;
		}
		
ArrayList<String> l2=new ArrayList<String>();
		
		
		l2.add("pune");
		
		l2.add("pillu");
		l2.add("tillu");
		l2.add("rano");
		l2.add("balu");
		
		
		System.out.println("\n");
		System.out.println("Second List");
		int j=0;
		for(String l:l2)
		{
			
			System.out.print("List2["+j+"]="+l+"   ");
			j++;
		}
		l1.addAll(2, l2);

		System.out.println("\n");
		System.out.println("After inserting index at 2 Location in List");
		int k=0;
		for(String l:l1)
		{
			
			System.out.print("List1["+k+"]="+l+"   ");
			k++;
		}
		
		
		
		
		
		
		
		
	}

}
