package src.strupattern.adapter;

public class BankAccount {

	private double principle;

	public BankAccount(double principle) {
		super();
		this.principle = principle;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	
	public double calculate()
	{
		return principle*0.10;
	}
}
