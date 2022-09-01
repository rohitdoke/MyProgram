package com.justimagine.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		List<StudentInfo> list=new ArrayList<StudentInfo>();
		
		list.add(new StudentInfo(101,"rohit","888"));
		list.add(new StudentInfo(102,"ganu","898"));
		
		
		for(StudentInfo l:list)
		{
			System.out.println(l);
		}
	}

}
