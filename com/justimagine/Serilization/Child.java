package com.justimagine.Serilization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
public class Child extends Parent {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int id=40;
	
	public Child(int id ,String name) {
		
		
		this .id=id;
		this.name = name;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Child c=new Child(20,"rohit");
	
		Parent p=new Child(80,"ranjit");
		System.out.println(p.id);
		
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(c);
		System.out.println(" objects after Serilazation ");
		
		System.out.println("id="+c.id+"name="+c.name);
		
		System.out.println("Serilazation completed");
		
		
		System.out.println("Desirlization started");
		
		FileInputStream fis=new FileInputStream("abc.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Child c1=(Child)ois.readObject();
		System.out.println("id="+c1.id+"name="+c1.name);
		
		
		 
		
		
	}

}
