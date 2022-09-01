package com.justimgine.controlstatement;

public class CheckLeapYear {

	int year;
	public void getLeapYear(int year)
	{
		
		this.year=year;
	if(year%4==0)
	{
		
		System.out.println("This Year"   +year+  "is Leap year.");
	}
	else
	{
		
		System.out.println("This year "+year+"is not leap year");
	}
		
		
	}
	public static void main(String[] args) {
		CheckLeapYear l1=new CheckLeapYear();
		l1.getLeapYear(2020);
		
		
		
		
		

	}

}
