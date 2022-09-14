package com.justimagine.String;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountcharusinghashMap {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("D:\\Velocity java\\Collection\\stirngcount.txt"));
	
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		String line=br.readLine();
		while(line!=null)
		{
					
			for(int i=0;i<line.length();i++)
			{	
				
				if(line.charAt(i)=='a'|| line.charAt(i)=='e'|| line.charAt(i)=='i'||line.charAt(i)=='o'|| line.charAt(i)=='u'||
						line.charAt(i)=='A'|| line.charAt(i)=='E'|| line.charAt(i)=='I'||line.charAt(i)=='O'|| line.charAt(i)=='U'	)
				{
				 
					map.put(line.charAt(i),map.get(line.charAt(i)+1) );
				}
				else if (line.charAt(i)>='0'&& line.charAt(i)<='9')
				{
			
					map.put(line.charAt(i),line.charAt(i)+1);
				}
			
			}
			
			line=br.readLine();
		 }
		br.close();
	
	
		System.out.println(map);
	}

}
