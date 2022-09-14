package com.justimagine.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateArrayList {
	
	
	public List<Integer> removeDuplicate(List<Integer> list)
	{
		
		List<Integer> list2=new  ArrayList<Integer>();
		
		for(Integer i:list)
		{
			if(!list2.contains(i))
			{
			
				list2.add(i);
			}
		}
		
		return list2;
	}

	public static void main(String[] args) {
		
		
		RemoveDuplicateArrayList removed=new RemoveDuplicateArrayList();
		List<Integer> list=Arrays.asList(41,42,86,72,41,62,10,42,10);
		
		System.out.println("Before Removing  duplicate Element:"+list);
		
	List<Integer> list3=removed.removeDuplicate(list);
		
	System.out.println("After Removingduplicate Element:");
		System.out.println(list3);

	}

}
