package com.justimagine.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class BasicOpertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> h1=new HashMap<Integer, String>();
	
	
	
		h1.put(10,"rohit");
		
		h1.put(null, "magn");
		h1.put(40, "mahesh");
		//System.out.println(h1.put(10, "rohit"));
		h1.put(41, null);
		//h1.put(null,null);
		h1.put(10,"r");
		
		/*
		Set<Integer> s=h1.keySet();
		
		
		Iterator<Integer> itr = s.iterator();
		
		while(itr.hasNext())
		{
			int i=itr.next();
			
			System.out.println("key:="+i+ "  "+"Value:="+h1.get(i));
		}
		
		h1.put(10, "Rohit");
		System.out.println(h1);
		h1.remove(10);
		*/
		System.out.println(h1);
		
	
	}

}
