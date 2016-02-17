package com.src;

public class HousingLoan extends LoanAccount {

	
	private double processingFees;
	
	/**
	 * 
	SubClass - Product 1
	
	**/

	
	protected HousingLoan(double rateOfInterest) {
		super(rateOfInterest);
		
		
		this.processingFees = 2000.00;
	}

	@Override
	public double getLoanAmount(double Amount) {
		
		return (Amount*getRateOfInterest() + processingFees)/100.00;
	}
}
