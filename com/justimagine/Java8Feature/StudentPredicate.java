package com.justimagine.Java8Feature;

public class StudentPredicate {

	
	
	private  String name;
	
	private int roll;
	private int marks;
	public StudentPredicate(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentPredicate [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
