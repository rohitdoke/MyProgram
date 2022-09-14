package com.justimagine.Java8Feature;

import java.util.HashMap;
import java.util.Map;

public class StringOccuranceUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Hello";
		
		char[] a=str.toCharArray();
		
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		
		for(int i=0;i<a.length;i++)
		{
			
				
				if(map.containsKey(a[i]))
				{
					map.put(a[i],map.get(a[i])+1);
				}
				else
				{
					
					map.put(a[i], 1);
				}
				
		}
		
		System.out.println(map);
		
		
		
	}

}
