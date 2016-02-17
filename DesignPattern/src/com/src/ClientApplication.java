package com.src;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoanAccount account =LoanFactory.getInstance();
		System.out.println("personal Loan Amount --- "+ account.getLoanAmount(200000.00));
		System.out.println("Rate Interest --- "+account.getRateOfInterest());
		LoanAccount account2 =LoanFactory.getInstance(LoanType.HousingLoan);
		System.out.println("Housing  Loan Amount --- "+ account2.getLoanAmount(500000.00));
		System.out.println("Rate Interest --- "+account2.getRateOfInterest());
	}

}
