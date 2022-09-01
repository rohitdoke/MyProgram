//Design method public int getNumberCube(int num), return int value to that method and result should be into main method.
package com.justimagine.AssignmentNo7;

import java.util.Scanner;

public class FindCube {
	int num;
	int cube=1;
	
	public int getNumberCube(int num)
	{
		
		this.num=num;
		
		
		cube=num*num*num;
		
		return cube;
	}
	
	
	

	public static void main(String[] args) {
	
		
		
		
		FindCube c1=new FindCube();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the value:");
		int i=sc.nextInt();
		System.out.println("cube of given number   "+i+"  is:\t"+c1.getNumberCube(i));
		
		
		sc.close();
		
		
		

	}

}
