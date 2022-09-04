package com.justimagine.Collection.Hashset;
import java.util.*;
public class MethodReturnMap {

	
	public static Map<Integer,String>addStudent()
	{
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(10, "mangesh");
		
		map.put(45, "Ranjit");
		
		map.put(40, "Rohit");
		
		map.put(55, "Rohan");
		
		return map;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map2=addStudent();
		
		System.out.println(map2);
		
			Set<Integer> set = map2.keySet();
		
			Iterator<Integer> itr = set.iterator();

			while(itr.hasNext())
			{
				int a=itr.next();
				System.out.println("key="+a+"  Value="+map2.get(a));
				
			}
			

	}

}
