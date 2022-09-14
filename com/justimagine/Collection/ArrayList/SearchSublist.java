//Get Sub List of ArrayList

package com.justimagine.Collection.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SearchSublist {

	public static void main(String[] args) {
		
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("tuka");
		list1.add("Rohan");
		list1.add("sono");
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Rohit");
		
		list.add("Ganesh");
		
		list.add("maruti");
		
		list.add("sono");
		list.add("Rano");
		
		list.add("tuka");
		list.add("Rohan");
		list.add("mohan");
		list.add("dinesh");
		
		boolean b=list.containsAll(list1);
		
		System.out.println(b);
		
		
		List sublist=list.subList(2, 5);//create sublist
		
		//Get the index of last occurrence of the element in the ArrayList

		int i=Collections.lastIndexOfSubList(list, sublist);
		
		System.out.println("lastIndexOfSubList="+i);
		System.out.println(sublist);
		list.ensureCapacity(5);
		
		System.out.println(list.size());
		
		
	}

}
