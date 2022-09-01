package com.justimagine.Exception;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManager manager=new StudentManager();
		try {
			
			
			Student student=manager.find("1");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
