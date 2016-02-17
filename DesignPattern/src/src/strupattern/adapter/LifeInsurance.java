package src.strupattern.adapter;

public class LifeInsurance {

	private double policyAmount;

	public LifeInsurance(double policyAmount) {
		super();
		this.policyAmount = policyAmount;
	}
	
	public double calculatePremium()
	{
		return policyAmount*0.25;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
}
