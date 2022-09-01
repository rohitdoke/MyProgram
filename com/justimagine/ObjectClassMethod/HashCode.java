package com.justimagine.ObjectClassMethod;

public class HashCode {

	
	int rollno;
	
	
	HashCode(int rollno)
	{
		this.rollno=rollno;
		
	}
	
	public int hashCode()//In this case Object class toString( ) method got executed which is internally calls Test class hashCode( ) method
	{
		return rollno;
	}
	
	public String toString()
	{
		
		return rollno+"";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashCode h1=new HashCode(200);
		
		System.out.println(h1);
		
		HashCode h2=new HashCode(1000);
		System.out.println(h2);
		
		

	}

}
