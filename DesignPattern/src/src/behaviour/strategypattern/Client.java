package src.behaviour.strategypattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cardpayment card = new Cardpayment();
		BillPayment bill = new BillPayment(card);
		System.out.println("Bill PayMent::\n"+bill.makepayment(5000, "100000023423").toString());
		System.out.println("============================================");
		CashPayment cash = new CashPayment();
		BillPayment bill1 = new BillPayment(cash);
		System.out.println("Bill PayMent::\n"+bill1.makepayment(15000, "").toString());
		
		//bill.setStrategy(card);
		
		
	}

}


