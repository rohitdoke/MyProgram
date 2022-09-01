package com.justimagine.AssignmentNo7;

public class PrimeNumber {
	
	int num;
	public void getPrimenumber(int num)
	{
		int m=0;
		m=num/2;
		boolean flag=false;
		if(num==0||num==1)
		{
			System.out.println("This is not prime number");
		}
		else
		{	
			for(int i=2;i<=m;i++)
			{
				if(num%i==0)
				{
				
					
						System.out.println("This is not prime number");
					
					flag=true;
					break;
				}
			
			}
		}
		if(flag==false)
		{
			System.out.println("This is prime number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber p1=new PrimeNumber();
		p1.getPrimenumber(19);
		
	}

}
