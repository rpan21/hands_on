package com.src;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner in = new Scanner("System.in");
//		System.out.println("Enter user name:");
//		String user = in.nextLine();
//		System.out.println("Enter user password:");
//		String pass = in.nextLine();
		
		
	User user1 = new User("nazir","nazir21");
	
		Check obj = new Check();
		obj.check(user1.getUserName(), user1.getPassword());
		
		
	}

}
