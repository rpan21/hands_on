package com.pattern.singleton;

public class Counter {

	private static Counter count;
	private  static int countNo = 0;
	private Counter() {
		
		// TODO Auto-generated constructor stub
	}
	
	public synchronized static Counter getInstance()
	{
		if(count==null)
		
			count = new Counter();
			countNo++;
		
		return count;
	}

	public static int getCountNo() {
		return countNo;
	}

	
	
	
	
}
