package com.justimagine.com;

public class StudentName {

	String name;
	
	public String getString(String name)
	{
		
		
		this.name=name;
		return name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentName s=new StudentName();
		s.getString("Rohit");
		System.out.println("My name is:"+s.name);
		
		

	}

}
