package src.strupattern.adapter;

public class BankAccountAdapter extends BankAccount {

	private LifeInsurance life ;

	public BankAccountAdapter(double principle, LifeInsurance life) {
		super(principle);
		this.life = life;
	}
	
public double findTotaldue()
{
	double isDue = life.calculatePremium();
	double bankDue=calculate();
	double totalDue =isDue+bankDue;
	return totalDue;
}
	
}
