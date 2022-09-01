package com.justimagine.Serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String name;
	int cid;
	public Customer(String name,int cid) {
		
		this.name=name;
		this.cid=cid;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", cid=" + cid + "]";
	}

	public static void main(String args[]) throws IOException
	{
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Rohit\\OneDrive\\Desktop\\Assignments\\rohit.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Customer c1=new Customer("minu", 15);
		
		oos.writeObject(c1);
		oos.flush();
		oos.close();
		System.out.println(" customer Object Serilizeed succefully");
	}
	
}
