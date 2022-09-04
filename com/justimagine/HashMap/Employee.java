package com.justimagine.HashMap;
import java.util.*;
public class Employee {

	
	
	public Map<Integer,String> m1()
	{
		
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(10, "Rohian");
		map.put(12, "mohit");
		
		map.put(45, "mangesh");
		
		return map;
		
	}
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		Map<Integer, String> obj=e1.m1();
		
		
		Set<Integer> set = obj.keySet();
		for(Integer i:set)
		{
			
			System.out.println("key:="+i);
			System.out.println("value:="+obj.get(i));
		}
	}
}
