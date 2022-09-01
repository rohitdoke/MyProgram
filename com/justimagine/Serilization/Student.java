package com.justimagine.Serilization;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String sname;
	int id;
	
	public Student(String sname,int id) {
		
		this.sname=sname;
		this.id=id;
	}
	
		
		@Override
	public String toString() {
		return "Student [sname=" + sname + ", id=" + id + "]";
	}


		public static void main(String args[]) throws IOException
		{
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Rohit\\OneDrive\\Desktop\\Assignments\\rohit.txt");
			
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Student s1=new Student("rani", 12);
			
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			System.out.println(" Student Object Serilizeed succefully");
			
		}
		
		
	

}
