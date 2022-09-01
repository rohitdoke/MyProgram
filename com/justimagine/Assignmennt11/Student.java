//I have student class now user restricts to create the object of that class from outside, write the code for it.

package com.justimagine.Assignmennt11;

public abstract class Student {
	
	String name;
	int rollno;
	String address;
	
				Student(String name,int rollno,String address)
				{
					
					this.name=name;
					this.rollno=rollno;
					this. address=address;
				}
				
				abstract void display() ;
					
					
					
				
	
	

	
	
}
