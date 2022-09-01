package com.justimagine.FileIOOperation;
import java.io.*;
public class FileBytestreamOpertion {
	
	public void readData() throws IOException
	{
		char[] array= new char[100];
		FileInputStream fin=new FileInputStream("C:\\Users\\Rohit\\OneDrive\\Desktop\\Assignments\\xyz.pdf");
		
		InputStreamReader is=new InputStreamReader(fin);
		is.read(array);
		
		
		System.out.println("Data in pdf file");
		System.out.println(array);
		
		is.close();
		
	}


	public static void main(String[] args) {
		
		FileBytestreamOpertion f1=new FileBytestreamOpertion();
				try {
					f1.readData();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
