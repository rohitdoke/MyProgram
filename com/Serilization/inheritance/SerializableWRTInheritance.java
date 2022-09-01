package com.Serilization.inheritance;

import java.io.*;

public class SerializableWRTInheritance {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		
		Dog d1=new Dog();
		//d1.i=888; 
		d1.j=999;
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Rohit\\OneDrive\\Desktop\\Assignments\\abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.close();
		System.out.println("Deserialization started"); 
		FileInputStream fis=new FileInputStream("C:\\Users\\Rohit\\OneDrive\\Desktop\\Assignments\\abc.ser"); 
		ObjectInputStream ois=new ObjectInputStream(fis); 
		Dog d2=(Dog) ois.readObject();
		System.out.println(d2.i+"........."+d2.j); 
		ois.close();
	}

}
