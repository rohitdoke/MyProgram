//Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 
//5*1=5.......5*10=50)
package com.justimagine.LoopAssignment;

public class MultiplicationTable {
	
	
	void multiplication(int no)
	{
		for(int i=1;i<=10;i++)
		{
			
			int mul=no*i;
		System.out.println(no+ "*"+i+"="+mul);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is Multiplication table")
;
			MultiplicationTable m1=new MultiplicationTable();
			m1.multiplication(5);
		}

}
