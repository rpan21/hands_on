import java.util.Scanner;

public class Sales_Tax {

	public static void main(String[] args) {
		
	//	Tax obj = new Tax(12);
	//	System.out.println(obj.calcTax(12000));
		
		System.out.println("enter a value for sales_tax :\n");
		Scanner in = new Scanner(System.in);
		double tax = in.nextDouble();
		
		System.out.println("enter a value for Purchase amount:\n");
		Tax obj1 = new Tax(tax);
		
		double purchase = in.nextDouble();
		System.out.println("value for tax:\n" + obj1.calcTax(purchase));
		in.close();
	}


}
