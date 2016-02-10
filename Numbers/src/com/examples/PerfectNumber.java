package com.examples;

import java.awt.List;
import java.util.ArrayList;

public class PerfectNumber {

	private int number;
	private ArrayList<Integer> divisors = new ArrayList<Integer>();
	
	
	public PerfectNumber(int number) {
		super();
		this.number = number;

		
	}
	
	
	
	public boolean ischeck()
	{
		int result=0;
		for(int i=0;i<divisors.size() ; i++)
		{
			result = result + divisors.get(i);			
		}
		if(result==number)
		return true;
		else
		return false;
		
	}
	
	private ArrayList<Integer> divisorslist()
	{
		
		int n=number/2;
		for(int i=1;i<n;i++)
		{
			if(number % i ==0)
			
			
			divisors.add(i);
			
		}
		
		return divisors;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	



	
	
	
	
	
	
}
