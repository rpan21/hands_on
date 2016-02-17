package src.strupattern.adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LifeInsurance life = new LifeInsurance(20000);
        System.out.println("Policy Amount's Interest : "+life.calculatePremium());
		BankAccountAdapter obj = new BankAccountAdapter(6000, life);
		System.out.println("Bank Loan_Amount's Interest : "+obj.calculate());
		System.out.println("Total Due : "+obj.findTotaldue());
	}

}
