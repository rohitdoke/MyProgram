package com.justimagine.String;

public class StarPatternProgram {

	public static void main(String[] args) {
		

	
		int rows=4;
		
		for(int i =0;i<rows;i++)
		{
			
			for(int j=rows-i;j>1;j--)
			{
				
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++){
				
				System.out.print(" *");
			}
		
			System.out.println("\n");
		}
	
	
	}

}
