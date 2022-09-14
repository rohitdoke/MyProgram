package com.justimagine.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Compare2ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(86);
		list.add(85);
		list.add(24);
		list.add(42);
		list.add(42);
		list.add(92);
		list.add(74);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(74);
		list2.add(41);
		list2.add(411);
		list2.add(92);
		list2.add(111);
		list2.add(71);
		list2.add(69);
		
	boolean b=list2.equals(list);
	
	System.out.println(b);
	}

}
