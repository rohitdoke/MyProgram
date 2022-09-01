package com.justimagine.Serilization;

import java.io.*;

public class Employee implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	String name;
	String address;
	 final int salary;
	
	public Employee(String name,String address,int salary) {
		this.name=name;
		this.address=address;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	
	
	
	
	
}
