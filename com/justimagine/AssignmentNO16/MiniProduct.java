package com.justimagine.AssignmentNO16;

import java.util.Scanner;

public class MiniProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1=new Product();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Weight of the Ironbar");
		
		int weight=sc.nextInt();
		
		try {
			p1.productCheck(weight);
		} catch (Exception e) {
			System.out.println("Exception is cought:"+e);
		}
		
		sc.close();
	}
}
