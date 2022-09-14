package com.justimagine.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort implements Comparable<EmployeeSort> {

	
	
	private Integer id;
	private  String name;
	private Integer salary;
	
	
	public EmployeeSort(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	


	@Override
	public String toString() {
		return "Employeesort [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getSalary() {
		return salary;
	}



	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	

	public static void main(String[] args) {
	
		
		List<EmployeeSort> list=new ArrayList<EmployeeSort>();
		
		list.add(new EmployeeSort(45,"rohit",500000));
		list.add(new EmployeeSort(02,"Ranjit",30000));
		list.add(new EmployeeSort(22,"Mahesh",8000));
		list.add(new EmployeeSort(11,"mangesh",90421));
		list.add(new EmployeeSort(63,"sonali",60004));
		list.add(new EmployeeSort(23,"monali",45220));
		list.add(new EmployeeSort(55,"mrunali",62221));
		list.add(new EmployeeSort(12,"marauti",75825));
		list.add(new EmployeeSort(96,"Ganesh",26245));
		list.add(new EmployeeSort(36,"somanath",80000));
	
		Collections.sort(list);
		
		System.out.println(list);
		
		for(EmployeeSort s1:list)
		{
			System.out.println("Id="+s1.getId());
			System.out.println("Name="+s1.getName());
			
			
		}
		
	}



	@Override
	public int compareTo(EmployeeSort o) {
		
		if(id>o.getId())
		{
			return 1;
		}
		else if(id<o.getId())
		{
			return -1;
		}
		else
		{
			
			return 0;
		}
		
	}

}
