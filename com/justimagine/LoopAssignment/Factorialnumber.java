/*Design method int 
factorial(int no)  which returns int value to that method. print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)
*/
package com.justimagine.LoopAssignment;

public class Factorialnumber {

	int no;
	int fact=1;
	int factorial(int no)
	{ this.no=no;
		
		for( int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		
		
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Factorialnumber fact1=new Factorialnumber();
		int factoral=fact1.factorial(5);
		System.out.println(factoral);
		
		
		
		
		
			
	}

}
