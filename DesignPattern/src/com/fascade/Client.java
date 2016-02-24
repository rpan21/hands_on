package com.fascade;

import java.util.HashMap;

public class Client {

	public static void main(String[] args)
	{
		HashMap<String, String> details = new HashMap<String, String>();
		FascadeDetails obj = new FascadeDetails();
		details.putAll(obj.getDetails());
		
		System.out.println(details.toString());
	}
	
}
