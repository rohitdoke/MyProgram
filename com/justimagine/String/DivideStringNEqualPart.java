package com.justimagine.String;

public class DivideStringNEqualPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="aaabbbcccddd";
		
		
		int len=str.length();
		
		System.out.println(len);
			for(int i=0;i<5;i++)
			{
				int mul=i*i;
				//System.out.println(mul);
				if(mul==len)
					System.out.println(i);
				
			}	
			//System.out.println("jbk");
		
	}

}
