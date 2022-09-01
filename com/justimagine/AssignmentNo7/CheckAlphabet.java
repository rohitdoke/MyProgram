//Design method to check whether the character is alphabet, digit and special symbol.
package com.justimagine.AssignmentNo7;
import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
	
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the character");
		
		char ch=sc.nextLine().charAt(0);
		
		if((ch>='a'&& ch<='z')&&(ch>='A'&& ch<='z'))
		{
		
			System.out.println("This is Character");
			
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("This is the Digit");
		}
		else {
			
			System.out.println("This is the Special Symbol?");
			
			
			sc.close();
			
		}
		

	}

}
