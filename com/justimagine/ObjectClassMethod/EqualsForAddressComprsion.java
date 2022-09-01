package com.justimagine.ObjectClassMethod;

public class EqualsForAddressComprsion {
	
	
	int rollno;
	String name;
	
	public EqualsForAddressComprsion(String name,int rollno) {
	
		this.name=name;
		this.rollno=rollno;// TODO Auto-generated constructor stub
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EqualsForAddressComprsion s1=new EqualsForAddressComprsion("rohit", 10);
		EqualsForAddressComprsion s2=new EqualsForAddressComprsion("Ranjit", 10);
		
		EqualsForAddressComprsion s3=new EqualsForAddressComprsion("ganesh",22);
		
		EqualsForAddressComprsion s4=new EqualsForAddressComprsion("rohit",10);
				
		s4=s1;
		
		System.out.println(s1.equals(s2));//false
		
		System.out.println(s2.equals(s3));//false
		
		System.out.println(s3.equals(s4));//false
		
		System.out.println(s1.equals(s4));//true
		
	}

}
