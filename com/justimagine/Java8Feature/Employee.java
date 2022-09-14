package com.justimagine.Java8Feature;

public class Employee {
	
	
	
	private String name;
	private Integer eid;
	private Integer salary;
	public Employee(String name, Integer eid, Integer salary) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public Integer getSalaray() {
		return salary;
	}
	public void setSalaray(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", salaray=" + salary + "]";
	}
	
	
	
	

}
