package com.src;

import java.util.Hashtable;
import java.util.*;
import java.util.Set;

public class ManagerEmployeeMap {
	
	private Hashtable<String, String[]> mgrToEmp;
	
	
	public ManagerEmployeeMap() {
		
		mgrToEmp =  new  Hashtable<String, String[]>();
		init();
	}


	private void init()
	{
	String[] emp = {"ramesh","vijay","ajit"};
	String[] emp1 = {"ranjit","vikash","rahul"};
		mgrToEmp.put("rakesh", emp );
		mgrToEmp.put("ramit", emp1 );
		
		
	}
	public void printEmployee()
	{
	
		Set<Map.Entry<String,String[]>> list = mgrToEmp.entrySet();
		
		for(Map.Entry<String,String[]> words:list)
		{
			System.out.println(words.getKey());
			String[]  xx = words.getValue();
				for(String n: xx)
				
			System.out.println(" := "+ n);
			
		}
	}
	public String[] findEmp(String manager)
	{
		
		
	
		String[] xx = mgrToEmp.get(manager);
		//for(int i=0;i<xx.length;i++)
			//return xx[i];
		return xx;
	}


	@Override
	public String toString() {
		return "ManagerEmployeeMap [mgrToEmp=" + mgrToEmp + "]";
	}
	

}
