package com.src;

public class LoanFactory {

	/**
	 * 
	 * factory method with Static method to create a instance of the subclass
	 * 
	 */
	
	public static LoanAccount getInstance()
	{
		return getLoanType(LoanType.PersonalLoan);
	}
	
	public static LoanAccount getInstance(LoanType type)
	{
		return getLoanType(type);
	}
	private static LoanAccount getLoanType(LoanType type)
	{
		LoanAccount account =null;
		switch(type)
		{
		case PersonalLoan : 
			account = new PersonalLoan(12.9);
			break;
		case HousingLoan :
			account = new HousingLoan(15.9);
			break;
		}
		return account;
	}
}
