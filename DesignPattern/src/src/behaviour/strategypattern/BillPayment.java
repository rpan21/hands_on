package src.behaviour.strategypattern;

public class BillPayment {

	
	PaymentStrategy strategy;
	
	public void setStrategy(PaymentStrategy strategy) {
		// TODO Auto-generated method stub
		
	}
	public PaymentStrategy getStrategy() {
		return strategy;
	}
	
	public String makepayment(double amt, String description) {
		return strategy.pay(amt, description);
	}
	public BillPayment(PaymentStrategy strategy) {
		super();
		this.strategy = strategy;
	}

}
