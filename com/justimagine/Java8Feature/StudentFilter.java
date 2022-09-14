package com.justimagine.Java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class StudentFilter {
	
	public static List<String> filter(List<StudentPredicate> l,Predicate<StudentPredicate> p)
	{
		List<String> result=new ArrayList<String>();
		for(StudentPredicate s:l)
		{
			if(p.test(s))
			{
				//String  name=
				result.add(s.getName());
			}
			
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		List<StudentPredicate> list=new ArrayList<StudentPredicate>();
		
		list.add(new StudentPredicate("rohit",10,80));
		list.add(new StudentPredicate("ganesh",20,85));
		list.add(new StudentPredicate("mangesh",22,50));
		list.add(new StudentPredicate("Ranjit",16,70));
		list.add(new StudentPredicate("Rohan",11,52));
		list.add(new StudentPredicate("savita",15,56));
		list.add(new StudentPredicate("monali",23,86));
		list.add(new StudentPredicate("Aakash",33,99));
		
		
		Predicate <StudentPredicate> p1=i->i.getMarks()>75;
		Predicate <StudentPredicate> p2=i->i.getMarks()>90;
		Predicate <StudentPredicate> p3=i->i.getMarks()<60;
		
		
		List<String> student=filter(list,p1);
		System.out.println("This List of student marks greater than 75:"+student);
		
		List<String> student2=filter(list,p2);
		System.out.println("This List of student marks greater than 90:"+student2);
		
		List<String> student3=filter(list,p3);
		System.out.println("This List of student marks less than 60:"+student3);
		
		
		
		
		
	}

}
