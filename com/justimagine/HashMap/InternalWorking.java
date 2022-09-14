package com.justimagine.HashMap;

import java.util.HashMap;
import java.util.Map;

public class InternalWorking {
	
	
	private Integer id;
	private String name;
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public InternalWorking(Integer id, String name) {
		
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "InternalWorking [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		
		
		Map<InternalWorking,String> map=new HashMap<InternalWorking,String>();
		
		
		map.put(new InternalWorking(10,"rohit"), "class1");
		map.put(new InternalWorking(10,"rohit"), "class2");
		
		System.out.println(map);
		
		

	}

}
