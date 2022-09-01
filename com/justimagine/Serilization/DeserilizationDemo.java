package com.justimagine.Serilization;
import java.io.*;
public class DeserilizationDemo  {

	/**
	 * 
	 
	private static final long serialVersionUID = 1L;
	private String salary;
	private String address;
	private String name;
	*/
	
	public static void main(String[] args) throws EOFException {

		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Rohit\\OneDrive\\Desktop\\Assignments\\rohit.txt");
			
			ObjectInputStream oos=new ObjectInputStream(fis);
				
				
			
				Object o=null;
				
			while( (o=oos.readObject())!=null)
			{
			 
					if(o instanceof Employee)
					{
						Employee e1=(Employee)o;
						System.out.println(e1);
						//System.out.println("Employee 1 info:   "+e1.name+"...."+e1.address+"...."+e1.salary);
					}
					else if(o instanceof Student)
					{
				
						Student s1=(Student)o;
						System.out.println(s1);
						
						//System.out.println("Sudent1 info:   "+s1.sname+"...."+s1.id);
					}
					else if(o instanceof Customer)
					{
						Customer c1=(Customer)o;
						System.out.println(c1);
						
						//System.out.println("Customer info:   "+c1.name+"...."+c1.cid);
					}
					
					
					
			}	
			
			
			
			
			
		
			//Employee e3=(Employee) oos.readObject();
			
			//Employee e2=(Employee) oos.readObject();
			
			
			
			
			//System.out.println("Employee 2 info:   "+e2.name+"..."+e2.address+"..."+e2.salary);
			//System.out.println("Employee 3 info:   "+e3.name+"...."+e3.address+"..."+e3.salary);
			
			
			
			oos.close();
		} 
		catch (EOFException eofex) {
			// eofex.printStackTrace();
			System.out.println("De-Serialization: All objects "
					+ "de-serialized from OrderOfObjects.ser file\n");
			System.out.println("End of file reached...\n");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
