package com.justimagine.String;

final public class ImutableStudentClass {
	
	final private Integer id;
	final private String name;
	

	public ImutableStudentClass(Integer id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
	public ImutableStudentClass mmutable(Integer id,String name)
	{
		
		if (this.getId()==(id) && this.getName()==name) {
			
			return this;
		}
		else
		{
			return new ImutableStudentClass(id,name);
		}
	}

	

	public Integer getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "ImutableStudentClass [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
		ImutableStudentClass student1=new ImutableStudentClass(56, "rohit");
		
		System.out.println(student1);
		
		String s2=student1.getName().toUpperCase();
		
		System.out.println(s2);
		
		
		
		
		ImutableStudentClass Student2=student1.mmutable(55, "ganesh");
		System.out.println(Student2);
		
		
		ImutableStudentClass student3=student1.mmutable(56, "rohit");
		System.out.println(student3);
		
		ImutableStudentClass student4=student1.mmutable(56, "rohit");
		System.out.println(student4);
		
		
		
		System.out.println(student1==Student2);
		System.out.println(student1==student3);
		System.out.println(student3==student4);
		
	}

}
