package com.src.strupattern.decorator;

public class OnlineBanking extends FeatureDecorator {

	BankAccount account;
	public OnlineBanking(BankAccount account) {
		super(account);
		this.account=account;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double balanceTomaintain() {
		// TODO Auto-generated method stub
		return account.balanceTomaintain()+6000.00;
	}

}
