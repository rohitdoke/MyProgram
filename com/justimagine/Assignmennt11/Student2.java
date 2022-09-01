package com.justimagine.Assignmennt11;

public class Student2 extends Student {
	
	int rollno;
	String name;
	String Schname;
	
	public Student2(String Schname) {
		super("rohit",10,"kari");
		
		this.Schname=Schname;
		
	}

	@Override
	void display() {
		System.out.println("Name of Student is="+super.name);
		
		System.out.println("Rollno name of Student="+super.name);
		System.out.println("Address name of Student="+super.address);
		
		System.out.println("Name of Student2 is="+super.name);
		
		System.out.println("Rollno name of Student2="+super.rollno);
		System.out.println("SchoolName of Student= "+Schname);
		
	}
	
	public static void main(String[] args) {
		
		
		//Student2 student2=new Student2("s.b.patil");
		//student2.display();
		Student s1=new Student2("s.b.paatil");
		
		s1.display();
		//=new Student("rohit",100);we can't crate object of abstract class
		
	}

}
