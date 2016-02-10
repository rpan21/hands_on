package examples;
import java.util.Scanner;

public class Fan extends Item {

	
	private String item_name = "FAN";
	private int lending_length;
	private double price ;
	private int quantity;
	
	





	@Override
	public String toString() {
		return "Fan [item_name=" + item_name + ", lending_length=" + lending_length + ", price=" + price + ", quantity="
				+ quantity + ", serial=" + serial + "]";
	}







	public Fan(long serial, int lending_length, int quantity) {
		super(serial);
	
		this.lending_length = lending_length;
		this.price = 0.0;
		this.quantity = quantity;
	}







	public Fan(long serial) {
		super(serial);
		// TODO Auto-generated constructor stub
	}







	@Override
	public double calculate() {
		
//		System.out.println("Enter the serial key");
//		Scanner in = new Scanner(System.in);
//		
//		Fan obj = new Fan(in.nextLong());
//		
//		return obj.toString();
		
		price = lending_length*12;
		price = price*quantity;
		return price;
		
	}

}
