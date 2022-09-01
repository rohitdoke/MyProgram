package com.justimagine.ObjectClassMethod;

public class EqualForContentComparsion {
	

/*
	String s1 = new String("ashok");
	String s2 = new String("ashok");
	System.out.println(s1==s2);  //false
	System.out.println(s1.equals(s2) );  //true
	


StringBuffer s1 = new StringBuffer("ashok");
StringBuffer s2 = new StringBuffer("ashok"); 
System.out.println(s1==s2);  //false 
System.out.println(s1.equals(s2) );  //false 
}	*/
	int rollno;
	String name;
	
	public EqualForContentComparsion(String name,int rollno) {
		// TODO Auto-generated constructor stub
	
		this.rollno=rollno;
		this.name=name;
		
	
	}
	
	public boolean equals(Object obj)
	{
	
		
			
				if(this==obj)
				{
					return true;
				
				}
				if(obj instanceof EqualsForAddressComprsion)
				{	
				
					EqualsForAddressComprsion s2=(EqualsForAddressComprsion) obj;
				
			
					if(name.equals(s2.name) && rollno==s2.rollno)
					{
						return true;
				
					}
					else
					{
						return false;
					}
				}
				else
				{
					
					return false;
				}
				
	}
	
	
	public static void main(String[] args) {
		
		EqualsForAddressComprsion s1=new EqualsForAddressComprsion("mahesh", 03);
		//EqualsForAddressComprsion s2=new EqualsForAddressComprsion("ganesh", 86);
		EqualsForAddressComprsion s2=new EqualsForAddressComprsion("mahesh", 03);
		//s1=s3;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		//System.out.println(s2.equals(s3));
		//System.out.println(s1.equals(s3));
		System.out.println(s1.equals("mahesh"));
		
		
	}
	
	
	
	

}
