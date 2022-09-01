package com.justimagine.Collection.Linkedlist;

import java.util.LinkedList;

public class Employee {

	
	private String name;
	private String id;
	
	public Employee(String name, String id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}



	private int salary;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	public static void main(String[] args) {
	LinkedList<Employee> list=new LinkedList<Employee>();
	
		list.add(new Employee("ganesh","122",4522));
		list.add(new Employee("rohit","222",60000));
		list.add(new Employee("mangu","12",46200));
		list.add(new Employee("dinu","22",50000));
		list.add(new Employee("ramu","56",70000));
		
		//System.out.println(list);
		
		int i=0;
		for(Employee l1:list)
		{
			System.out.println("list["+i+++"]="+l1);
			
		}
		
		
		//adding Element in Specified position
		
		
		list.add(2, new Employee("dinesh","66",80000));
		System.out.println("\nAfter adding element at index 2\n");
		
		int j=0;
		for(Employee l1:list)
		{
			System.out.println("list["+j+++"]="+l1);
			
		}
		
		//after removing element from list
		
		list.remove(3);
System.out.println("\nAfter Removing element at index 3\n");
		
		int k=0;
		for(Employee l1:list)
		{
			System.out.println("list["+k+++"]="+l1);
			
		}
		
		//after remove head of the list 
		
		
		
		list.remove();
		
		
System.out.println("\nafter removing head element \n");
		
		int m=0;
		for(Employee l1:list)
		{
			System.out.println("list["+m+++"]="+l1);
			
		}
	}
	
}
