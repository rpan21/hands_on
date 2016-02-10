package com;

public class YourThread implements Runnable {
	double j=100;

	@Override
	public void run() {
		double j=100;
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<10;i++)
		{
			System.out.println(calculate());
		}

	}
	
	public double calculate()
	{
		
		return ++j;
	}

}
