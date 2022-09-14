package com.justimagine.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComapratorSort {
	
	private Integer id;
	private  String name;
	private Integer salary;
	

	public ComapratorSort(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	


	@Override
	public String toString() {
		return "ComapratorSort [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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
		
		
		List<ComapratorSort> list=new ArrayList<ComapratorSort>();
		
		list.add(new ComapratorSort(45,"rohit",500000));
		list.add(new ComapratorSort(02,"Ranjit",30000));
		list.add(new ComapratorSort(22,"Mahesh",8000));
		list.add(new ComapratorSort(11,"mangesh",90421));
		list.add(new ComapratorSort(63,"sonali",60004));
		list.add(new ComapratorSort(23,"monali",45220));
		list.add(new ComapratorSort(55,"mrunali",62221));
		list.add(new ComapratorSort(12,"marauti",75825));
		list.add(new ComapratorSort(96,"Ganesh",26245));
		list.add(new ComapratorSort(36,"somanath",80000));
		
		Collections.sort(list,new MyComprator());
		
		System.out.println(list);
		
		for (ComapratorSort emp : list) {
			System.out.println("Name>>" + emp.getName()+ " id>>" + emp.getId()+ " salary>>" + emp.getSalary());
		}

	}

}
