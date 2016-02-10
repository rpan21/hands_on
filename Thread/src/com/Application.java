package com;

public class Application {

	public static void main(String[] args) {
		
		//Thread obj = new MyThread();
		//obj.start();
//		System.out.println(Thread.currentThread().getName());
//		Thread obj1 = new MyThread();
//		obj1.setName("Thread's Name");
//
//		obj1.start();
		
		// in order to execute the yourthread.java
		
		YourThread t = new YourThread();
		
		Thread th1 = new Thread(t,"Ram");
		Thread th2 = new Thread(t,"Shyam");
		Thread th3 = new Thread(t,"Badam");
		th1.start();
		th2.start();
		th3.start();
		
		
		
		
		
	}

	}


