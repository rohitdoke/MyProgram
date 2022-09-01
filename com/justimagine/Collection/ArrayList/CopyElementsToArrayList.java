/* Copies all of the elements from one list into another.
 *  After the  operation, the index of each copied element in the destination listwill be identical to its index in the source list.
 *   The destinationlist's size must be greater than or equal to the source list's size.If it is greater, the remaining elements in
 *    the destination list are unaffected. 
 */




package com.justimagine.Collection.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class CopyElementsToArrayList {

	
	
	public ArrayList<String> getCopyElements()
	{
	
		ArrayList<String> l1=new ArrayList<String>();
		
		l1.add("rohit");
		
		l1.add("mahesh")
;
		l1.add("Sagar");
		
		l1.add("mohit");
		

		System.out.println("First List");
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.print("list["+i+"]="+l1.get(i)+"   ");
		
		}
		
		ArrayList<String> l2=new ArrayList<String>();
		
		l2.add("doke");
		l2.add("monu");
		
		
		System.out.println("\n");
		System.out.println("Second  List");
		
		for(int i=0;i<l2.size();i++)
		{
			System.out.print("list["+i+"]="+l2.get(i)+"   ");
		
		}
		Collections.copy(l1, l2);
		System.out.println("\n");
		System.out.println("After Copying Collection Object into List");
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.print("list["+i+"]="+l1.get(i)+"   ");
		
		}
		System.out.println("\n\n");
		
		
		
		
		
		ArrayList<String> l3=new ArrayList<String>();
		
	
		System.out.println("l3 list is");
		
		System.out.println(l3);
		
		
		
		
		
		return (new ArrayList<String>(l1));
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		CopyElementsToArrayList a1=new CopyElementsToArrayList();
		
		
		
		System.out.println("after Copying "+a1.getCopyElements());

	}

}
