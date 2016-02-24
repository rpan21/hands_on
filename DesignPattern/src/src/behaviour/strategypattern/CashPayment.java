package src.behaviour.strategypattern;

public class CashPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		String msg = "Your Payment of INR."+amt+" , By cash "+ description+"\n";
		StringBuffer buffer = new StringBuffer(msg);
		double discount = amt*0.01;
		double total = amt-discount;
		buffer.append("Discount of Rs." +discount + " is Offered"+"\n");
		buffer.append("Total Amount : INR."+total);
		return buffer.toString();
	}

}
