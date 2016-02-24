package src.behaviour.strategypattern;

public class Cardpayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		String msg = "Your Payment of INR."+amt+" , By card "+ description+"\n";
		StringBuffer buffer = new StringBuffer(msg);
		double proceFee = amt*0.012;
		double total = amt+proceFee;
		buffer.append("Processing Fee of Rs." +proceFee + " is Chargeable"+"\n");
		buffer.append("Total Amount : INR."+total);
		return buffer.toString();
		
	}

}
