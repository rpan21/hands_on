package com;

//import java.util.Scanner;

public class Application {

	
	public static void main(String[] args)  {
		
    Convertor x = new Convertor();

	
try{
    System.out.println("celsius value :"+ x.farenToCelsius(null));
}
catch(NullPointerException e)
{
	System.out.println("Please Enter a valid value\n Enter non null values;");
	System.out.println(e.getMessage());
}	


}}
