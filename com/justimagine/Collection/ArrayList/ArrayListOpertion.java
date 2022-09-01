package com.justimagine.Collection.ArrayList;

import java.util.ArrayList;


public class ArrayListOpertion {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		
		list.add(10);
		
		list.add(30);
		list.add(42);
		list.add(null);
		list.add(86);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print("list["+i+"]="+list.get(i)+"   ");
		}
		
		System.out.println("\n\n");
		list.remove(2);
		
		System.out.println("Removing an element  at  inedex 2:");		
		for(int i=0;i<list.size();i++)
		{
			System.out.print("list["+i+"]="+list.get(i)+"   ");
		}
			
		System.out.println("\n");
		System.out.println("Adding Element at index 2");
		list.add(2, 60);//When adding element to particular index then its perform shifting operation not replacing.  
		for(int i=0;i<list.size();i++)
		{
			System.out.print("list["+i+"]="+list.get(i)+"   ");
		
		}
		
		ArrayList<Integer> list1=new ArrayList<Integer>();// new Arraylist
		list1.add(82);
		
		list1.add(42);
		
		list1.add(54);
		
		list.addAll(list1);//Append Collection Object to List
		
		
		System.out.println("\n");
		
		System.out.println("after Adding Collection Object into List");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print("list["+i+"]="+list.get(i)+"   ");
		
		}
		
		//Remove element from the specified index in ArrayList 2 to 5
		System.out.println("\n");
		for(int i=2;i<=4;i++)
		{
			
			System.out.println("Removed list["+i+"]=" +list.remove(i));//Because of shift operation we will get different results
			
		}
		
		
System.out.println("Remove element from the specified index in ArrayList 2 to 5");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print("list["+i+"]="+list.get(i)+"   ");
		
		}
		


	}
}