package com.justimagine.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import com.justimagine.Collection.ArrayList.ArrayListOpertion;

public class Arraylist {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		
		
		al.add("10");
		al.add(46);
		
		al.add(45);
		al.add("Rohit");
		
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		al.add(2,8666);
		Iterator itr = al.iterator();
	
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		ArrayListOpertion a=new ArrayListOpertion();
		al.add(a);
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print("list["+i+"]="+al.get(i)+"   ");
		
		}
		
	}

}
