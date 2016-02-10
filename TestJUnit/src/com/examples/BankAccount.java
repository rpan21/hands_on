package com.examples;

public class BankAccount {

	private long account_no;
	private String accountHolder_name;
	private double balance;
	
	public BankAccount(long account_no, String accountHolder_name, double balance) throws NullPointerException 
	
	{
		super();
		this.account_no = account_no;
		double bal = (Double)balance;
		if(accountHolder_name!=null && balance!=bal)
		{
			this.accountHolder_name = accountHolder_name;
		this.balance = balance;
		}
		else
			throw new NullPointerException();
			
	}
	
	public double withdrawl(double withdrawl)
	{
		
		if(this.balance - withdrawl>0.0){
			
			this.balance =this.balance - withdrawl;
		    return this.balance; 
		}
		else
			return this.balance;
		
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double deposit(double deposit)
	{
		if(this.balance + deposit<0.0)
			{
			return this.balance;
			}
		else
		{
			this.balance = this.balance + deposit;
		    return this.balance + deposit;
			
		}
	}
	
	
	

	@Override
	public String toString() {
		return "BankAccount [account_no=" + account_no + ", accountHolder_name=" + accountHolder_name + ", balance="
				+ balance + "]";
	}


	public long getAccount_no() {
		return account_no;
	}


	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}


	public String getAccountHolder_name() {
		return accountHolder_name;
	}


	public void setAccountHolder_name(String accountHolder_name) {
		this.accountHolder_name = accountHolder_name;
	}


	public double getBalance() {
		return balance;
	}


	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}



	
	
}
