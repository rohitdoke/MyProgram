package com.justimagine.AssignmentNo7;
import java.util.Scanner;
public class PrintFactorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the Value:");
		int num=sc.nextInt();
	System.out.println("Factor of given number are:");
	for(int i=1;i<=num;i++)
	{
		
		if(num%i==0)
		{
			System.out.println(i);
		}
	}
		
		
	sc.close();
	}
	

}
