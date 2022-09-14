package com.justimagine.Collection.Hashset;
import java.util.*;
public class UniversityMapDemo {
	
	
	
	public List<String> addTeacher()     //teacher List
	{
		List<String> Tlist=new ArrayList<String>();
		
		Tlist.add("Rahul");
		Tlist.add("Ganesh");
		Tlist.add("Praveen");
		
		Tlist.add("vaibhav");
		
		return  Tlist;
		
	}
	public List<String> addDeparment() //Department List
	{
		List<String> Dlist=new ArrayList<String>();
		
		Dlist.add("Dep-1");
		Dlist.add("Dep-2");
		Dlist.add("Dep-3");
		Dlist.add("Dep-4");
		
		return  Dlist;
		
	}
	public Map<String,List<String>> addDepartment1(List<String> Tlist,List<String> Dlist)// Department no1
	{

		List <String> l0=new ArrayList<String>();
		l0.add(Tlist.get(0));
		Map<String,List<String>> map1=new HashMap<String,List <String>>();
		
		map1.put(Dlist.get(0), l0);
		
		return map1;
	}
	public Map<String,List<String>>addDepartment2(List<String> Tlist,List<String> Dlist)// Department no2
	{
		
		Map<String, List<String>> map2=new HashMap<String,List<String>>();
		
		List<String> l=new ArrayList<String>();
		l.add(Tlist.get(1));
		l.add(Tlist.get(2));
		map2.put(Dlist.get(1),l);
		
		return map2;
	}

	public Map<String,List<String>>addDepartment3(List<String> Tlist,List<String> Dlist)// Department no3
	{
		
		Map<String,List <String>> map3=new HashMap<String,List <String>>();
		
		List<String> l2=new ArrayList<String>();
		l2.add(Tlist.get(1));
		l2.add(Tlist.get(3));
		
		
		map3.put(Dlist.get(2),l2);
		
		return map3;
	}

	public Map<String,List<String>> addDepartment4(List<String> Tlist,List<String> Dlist)// Department no4
	{
		List<String> l3=new ArrayList<String>();
		l3.add(Tlist.get(2));
		l3.add(Tlist.get(3));
		
		Map<String, List<String>> map4=new HashMap<String, List<String>>();
		
		map4.put(Dlist.get(3),l3);
		
		return map4;
	}
	
	
	
	public Map<String,Map<String,List<String>>> MergeDep(Map<String,List<String>> map1,Map<String,List<String>> map2,
			Map<String,List<String>> map3,Map<String,List<String>> map4)      //Merging of department to Branches
	{
		
		Map<String,Map<String,List<String>>> dep=new HashMap<String,Map<String,List<String>>>();
		
		dep.put("CSE", map1);
		dep.put("Mech", map2);
		dep.put("Civil", map3);
		dep.put("E&TC", map4);
		
		
		
		return dep;
	}

	//university mapping with department
		public Map<String,Map<String,Map<String,List<String>>>> university(Map<String,Map<String,List<String>>> dep)
		{
			Map<String,Map<String,Map<String,List<String>>>> uni=new HashMap<String,Map<String,Map<String,List<String>>>>();
			
			uni.put("University", dep);
			return uni;
			
		}		
			
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversityMapDemo s1=new UniversityMapDemo();
		
		List <String> l1=s1.addTeacher();
		List <String> l2=s1.addDeparment();
		
		Map<String, List<String>> m1=s1.addDepartment1(l1,l2);
		Map<String, List<String>> m2=s1.addDepartment2(l1,l2);
		Map<String, List<String>> m3=s1.addDepartment3(l1,l2);
		Map<String, List<String>> m4=s1.addDepartment4(l1,l2);
		
		Map<String,Map<String,List<String>>> merge=s1.MergeDep(m1,m2,m3,m4);
		
		Map<String,Map<String,Map<String,List<String>>>> University=s1.university(merge);
		
		
		//System.out.println(University);
		
		//Printing all Data 
			Set<String> set = University.keySet();
		
			for(String str:set)
			{
				
				System.out.println(str+" "+University.get(str));
				
			}
	}
}
