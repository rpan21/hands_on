package com;

import java.io.IOException;



public class JoinExample {

	public static void main(String[] args) {
    Thread t=new Thread()
{

	@Override
	public void run() {
		
		System.out.println("Reading");
		try
		{
		System.in.read();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Finished Reading");
		
	}
    	
	
};
t.start();
System.out.println("Starting");
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Finished");
	}

}
