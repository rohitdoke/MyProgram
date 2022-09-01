package com.justimagine.Serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilizationdemo {

	public static void main(String[] args) {

		
		try {
				FileOutputStream fos=new FileOutputStream("C:\\Users\\Rohit\\OneDrive\\Desktop\\Assignments\\rohit.txt");
		
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				
				Employee e1=new Employee("rohit","solapur",50000);
				//Employee e2=new Employee("ganesh","barshi",62222);
				//Employee e3=new Employee("mahesh","pune",5222);
				
				oos.writeObject(e1);
				Student s1=new Student("rani", 12);
				
				oos.writeObject(s1);
				
				Customer c1=new Customer("minu", 15);
				
				oos.writeObject(c1);
				//oos.writeObject(e2);
				//oos.writeObject(e3);
				System.out.println("Object Serilized Succefully");
				
				oos.flush();
				oos.close();
				
				
			}catch(IOException e)
		{
			e.printStackTrace();	
		}

	}

}
