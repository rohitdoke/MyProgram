// Write the Java program in which create the multiple objects and display the count of number of objects created into class.

package com.justimagine.AssignementNo9;
public class StudentInformtion {

	String name;
	 String address;
	long mobile;
	
	
	public StudentInformtion(String name,String address,long mobile)
	{
		this.name=name;
		this.address=address;
		this.mobile=mobile;
	}
	

	public void display()
	{
		System.out.println("Name:="+name);
		System.out.println("Address:="+address);
		System.out.println("MobileNumber:="+mobile);
		System.out.println("==============================================");
	}


}
