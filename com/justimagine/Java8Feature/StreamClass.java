package com.justimagine.Java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {
	
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,52,4,21,151,73,36,44);
		
	List<Integer>l1=list.stream().map( s->s*s).collect(Collectors.toList());
	
	System.out.println("List="+l1);
	}

}
