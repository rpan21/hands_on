package com.src;

public class PersonalLoan extends LoanAccount{

	private double processingFees;

	
	
	protected PersonalLoan(double rateOfInterest) {
		super(rateOfInterest);
     
		
		this.processingFees = 5000.00;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	SubClass - Product 2
	
	**/
	
	
	@Override
	public double getLoanAmount(double Amount) {
		
		return (Amount*getRateOfInterest()+ processingFees)/100.00;
	}
}
