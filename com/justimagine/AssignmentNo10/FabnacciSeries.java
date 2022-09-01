/*Write a java program to display the Fibonacci series up to given number. 
 * (Fibonacci series mean next number is the sum of previous two numbers 
 * for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).
 */

package com.justimagine.AssignmentNo10;

import java.util.Scanner;

public class FabnacciSeries {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to find fibonacci series:=\n");
		
		num=sc.nextInt();
		
		
		int i=0;
		int j=1;
		int sum;
		System.out.println("Fabonacci Serie of "+num+"is:Below \n");
		System.out.println(i+"\n"+j);
	for(int k=2;k<num;k++)
	{
		
		
		sum=i+j;
		
			System.out.println("\n"+sum);
			
			
			i=j;
			j=sum;
	}

	sc.close();
	
	}

}
