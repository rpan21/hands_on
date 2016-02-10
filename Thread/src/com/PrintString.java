package com;

public class PrintString {

	public synchronized static void print(String str1, String str2)
	{
		System.out.println(str1);
		try
		{
			Thread.sleep(5);
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getStackTrace());
			
		}
		System.out.println(str2);
	}
}
