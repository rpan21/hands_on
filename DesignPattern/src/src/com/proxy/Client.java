package src.com.proxy;

import java.awt.print.Printable;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CalculateBeanProxy proxy = new CalculateBeanProxy();
		print(proxy);
		
	}

	private static void print(CalculateBeanProxy bean) {
		double cel = bean.farenToCelsius(100);
		System.out.println("temperature : "+cel);
		
	}

}
