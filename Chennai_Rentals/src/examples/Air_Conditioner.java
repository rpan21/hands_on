package examples;
import java.util.Scanner;

public class Air_Conditioner extends Item {
	
	private String item_name = "AC";
	private int lending_length;
	private double price;
	private int quantity;
	
	





	@Override
	public String toString() {
		return "AC [item_name=" + item_name + ", lending_length=" + lending_length + ", price=" + price + ", quantity="
				+ quantity + ", serial=" + serial + "]";
	}







	public Air_Conditioner(long serial, int lending_length, int quantity) {
		super(serial);
	
		this.lending_length = lending_length;
		this.price = 0.0;
		this.quantity = quantity;
	}







	public Air_Conditioner(long serial) {
		super(serial);
		// TODO Auto-generated constructor stub
	}







	@Override
	public double calculate() {
		

		
		price = lending_length*140;
		price = price*quantity;
		return price;
		
	}
}
