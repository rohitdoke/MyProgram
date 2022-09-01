// program to print Multiplication table form 2 to 20
package com.justimagine.AssignmentNo14;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the Number");
		
		int num=sc.nextInt();
		
		Multiplication m1=new Multiplication();
		m1.getTable( num);
		sc.close();
	}
	
	
	public void getTable(int num)
	{
		
		
		
		while(num<=20)
		{
			System.out.println("Multiplication table of "+num);
			int i=1;
			int multi=1;
			while(i<=10)
			{
				multi=num*i;
				System.out.print(multi+" ");
				i++;
			}
			System.out.println("\n");
			num++;
			
		}
		
		
	}
}
