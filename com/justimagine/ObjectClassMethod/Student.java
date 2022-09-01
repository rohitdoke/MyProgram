package com.justimagine.ObjectClassMethod;

public class Student {
	String name;
	int rollno;
	
	
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}
	/*
	 * Object class toString method 
	 * public String toString()
	 * {
	 * 	return getClass().getName() +'@'+ Integer.toHexString(hashcode())//Hexadecimal string representation of hashcode
	 
	 */
	
	
	
	public String toString()
	{
		
		return name+"........."+rollno;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student("Rohit",445);
		Student s2=new Student("ranjit",74);
		
		System.out.println(s1);
		
		System.out.println(s1);
		
		System.out.println(s2);
	}

}
