package com.justimagine.FileIOOperation;
import java.io.*;
import java.util.Scanner;
public class FileOperation {

	
	
	
	public void Read() 		{
		
		
		try {
			FileReader fr = new FileReader("C:\\Users\\Rohit\\OneDrive\\Desktop\\Assignments\\abc.txt");
		
			
		
				BufferedReader br=new BufferedReader(fr);
		
		
				String line;
				
						line = br.readLine();
					
			
			while(line!=null)
			{
				System.out.println(line);
				line=br.readLine();
			}
			br.close();
			
		}catch (IOException e) {
			System.err.println(e);
		}
					
		System.out.println("File Read succefully");
		
		
		}
	public void write() 
	{
		try {
				FileWriter fw=new FileWriter("C:\\Users\\Rohit\\OneDrive\\Desktop\\Assignments\\abc.txt",true);
				BufferedWriter bw=new BufferedWriter(fw);
		
				Scanner sc=new Scanner(System.in);
				
				char ch;
				do {
						System.out.println("Enter the data:");
						String str=sc.next();
						bw.newLine();
						bw.write(str);
						
						System.out.println("you want add more data prss  'y'");
						 ch=sc.next().charAt(0);
				}while(ch=='y');
						
				bw.flush();
				bw.close();
				sc.close();
		}catch (IOException e) {
			System.err.println(e);
		}	
		System.out.println("File write succefully");
		
		
		
	}
		
	
	
	public static void main(String[] args)  {
		
		
		
		
		FileOperation f1= new FileOperation();
		f1.Read();
		f1.write();
		
		
			
		}
		
			
			

	

}
