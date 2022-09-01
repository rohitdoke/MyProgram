package com.justimagine.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
	
	
	private int id;
	private String name;
	private	String rollno;
	
	

	public StudentInfo(int id, String name, String rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}



	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getRollno() {
		return rollno;
	}



	public void setRollno(String rollno) {
		this.rollno = rollno;
	}



	/*public List<StudentInfo> getStudent(){
		
		List<StudentInfo> list=new ArrayList<StudentInfo>();
		list.add(new StudentInfo(10,"rohit","22"));
		list.add(new StudentInfo(12,"kkj","21"));
		
		return list;
		
		
		
	}*/

}
