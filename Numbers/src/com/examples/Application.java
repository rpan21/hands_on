package com.examples;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PerfectNumber obj = new PerfectNumber(24);
		
		if(obj.ischeck())
		
			System.out.println(obj.getNumber() + " is a perfect number");	
		else
			System.out.println(obj.getNumber() + " is  not a perfect number");
	}

}
