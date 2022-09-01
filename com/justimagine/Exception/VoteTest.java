package com.justimagine.Exception;
public class VoteTest {

	
	
		static void validate(int age)throws InvalidAgeEception
		{
			
			if(age<18)
			{
				
				throw new InvalidAgeEception("Your are child ");
			}
			else
			{
				System.out.println("Welcome to vote");
			}
		}
	public static void main(String[] args) {
		
		try {
			
			validate(12);
			
		} catch (InvalidAgeEception e) {
			
			
			System.out.println("Exception is cought:"+e);
			// TODO: handle exception
		}

	}

}
