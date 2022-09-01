/* Write java program to check whether number is Armstrong or not.
(A positive number is called Armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.

153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=1
*/
package com.justimagine.AssignmentNo10;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc =new Scanner(System.in);
	
	
		int num=0;
		int reminder=0;
		int sum=0;
		System.out.println("Please Enter the num :");
		num=sc.nextInt();
		int number=num;
		while(num!=0)
		{
				
			 reminder=num%10;
			
			 sum=sum+(reminder*reminder*reminder);
			
			 num=num/10;
		}
		
		//System.out.println(sum);
		if(sum==number)
		{
			
			System.out.println("This is Armstrong Number:");
			
		}
		else
		{
			System.out.println("This is not ArmString number:");
		}

		sc.close();
	}

}
