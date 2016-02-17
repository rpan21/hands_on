package com.src;

public abstract class LoanAccount {

	/**
	Super Type -super class
	
			**/
	
	private double rateOfInterest;
	
	protected LoanAccount(double rateOfInterest)
	{
		this.rateOfInterest = rateOfInterest;
	}
	
	public abstract double getLoanAmount(double Amount);

	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return rateOfInterest;
	}
	
}
