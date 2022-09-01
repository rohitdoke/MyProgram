package com.justimagine.String;

final public class ImmutableStringBuffer {
	
	
	StringBuffer s1=new StringBuffer("rohit");
	
	

	public ImmutableStringBuffer(StringBuffer s1) {
		super();
		this.s1 = s1;
	}
	
	
	public ImmutableStringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}


	public  ImmutableStringBuffer modify(StringBuffer s1)
	{
		
		
		if(this.s1.equals(this))
		{
			
			return this;
			
		}
		else
		{
			return(new ImmutableStringBuffer(s1));
		}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImmutableStringBuffer s1=new ImmutableStringBuffer("rohit");
		
		
		ImmutableStringBuffer s2=s1.modify(new StringBuffer("Doke"));
		
		ImmutableStringBuffer s3=s1.modify(new StringBuffer("rohit"));
		
		System.out.println(s1==s2);
		
		System.out.println(s1==s3);

	}

}
