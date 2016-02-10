package com;

public class UsePrintString implements Runnable {

	String str1,str2;
	
	public UsePrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		Thread t = new Thread(this);
		t.start();
	}

	public UsePrintString() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		
		PrintString.print(str1, str2);

	}

}
