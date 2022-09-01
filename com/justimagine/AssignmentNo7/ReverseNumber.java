package com.justimagine.AssignmentNo7;

import java.util.Scanner;

public class ReverseNumber {

	int reminder;
	int reverse=0;
	int num;
	public int getReverseNum(int num)
	{
		this.num=num;
	
			
		while(num!=0)
		{
			
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
			
			
		}
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseNumber r1=new ReverseNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number:");
		int i=sc.nextInt();
		int reversenum=r1.getReverseNum(i);
		System.out.println("The Reverse number of"  +i+  ":="+reversenum);
		sc.close();
		
		
		
		

	}

}
