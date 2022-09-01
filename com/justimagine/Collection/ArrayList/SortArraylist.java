//program to sort the ArrayList
package com.justimagine.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SortArraylist {
	
	
	
	
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter five Element to sort");

	for(int i=0;i<=5;i++)
	{

		System.out.println("please enter the "+i+" Element:");
	
		list.add(sc.nextInt());
	}
	System.out.println("Number before sorting:");
	for(Integer i:list)
	{
		System.out.print(i+"   ");
		
	}
	
	Collections.sort(list);
	
	System.out.println("\nNumber after sorting:");
	for(Integer i:list)
	{
		System.out.print(i+"   ");
		
	}
	Collections.reverse(list);
	System.out.println("\nNumbers  sorting in Descending order :");
	for(Integer i:list)
	{
		System.out.print(i+"   ");
		
	}
	
	sc.close();
	

}
}