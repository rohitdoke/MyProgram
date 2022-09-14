package com.justimagine.Java8Feature;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpOperation {

	public static void main(String[] args) {
		
		
		List<Employee> list=Arrays.asList(new Employee("rohit",42,55000),new Employee("Ranjit",22,50000),
				
				new Employee("Ganesh",15,60500),new Employee("mangesh",63,62422),new Employee("danish",32,55300),
				new Employee("Gopal",36,72556)	);
		
		//Employee e;
		
	
		
		
	List<Integer>l1=list.stream().map(Employee->Employee.getSalaray()+500).collect(Collectors.toList());
	
	System.out.println(l1);
	
	
	
	
	//sorting According to coparaotr
	
	Comparator<Employee> c =(s1,s2)->{
		
		return s1.getSalaray().compareTo(s2.getSalaray());
		
		
		
		
	};
	List<Employee>l2=list.stream().sorted(c).collect(Collectors.toList());
	System.out.println(l2);
	//sorting according to desending order
	List<Employee>l3=list.stream().sorted((e1,e2)->-e1.getSalaray().compareTo(e2.getSalaray())).collect(Collectors.toList());
	System.out.println(l3);
	
	
	
	
	
	//filter the Empolyee whose salary grater than 60000
	
	List<Employee> l4=list.stream().filter(e1->e1.getSalaray()>60000).collect(Collectors.toList());
	
	System.out.println(l4);
	
	list.stream().map(e1->e1.getSalaray()+500).forEach(e1->System.out.println(e1));
	
	
	
	
	
	
	
	
	
	
	}

}
