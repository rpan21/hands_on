package com.example;
import com.example.Greeting;
public class FirstApplication {

	public static void main(String[] args) {
		
		Greeting greet = ()->{System.out.println("I Know Java 8");};
		greet.show();

	}

}
