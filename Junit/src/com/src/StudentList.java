package com.src;


import java.util.HashSet;
import java.util.Set;



public class StudentList {

	Set<String> names;
	public StudentList()
	{
		names=new HashSet<String>();
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ramesh");
		
		
	}
	
	public static int get(int size){
		return size;
	}
	public Set<String> getNames(){
		return names;
	}
}
