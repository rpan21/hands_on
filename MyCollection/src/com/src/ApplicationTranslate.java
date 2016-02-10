package com.src;

import java.util.Scanner;

public class ApplicationTranslate {

	public static void main(String[] args)
	{
//		TranslateService obj = new TranslateService();
    	String x=null;
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the hindi key word : ");
//		x=in.nextLine();
//		System.out.println((obj.findEnglishWord(x)));
		//obj.printWords();
		
		
		
		
		///////
		
		
	ManagerEmployeeMap obj1= new ManagerEmployeeMap();
	System.out.println("Enter the Manager name  : ");
//		
	x=in.nextLine();
	String[] xx=obj1.findEmp(x);
	for(String n:xx)
	System.out.println(n);
//		obj1.printEmployee();
	}
}
