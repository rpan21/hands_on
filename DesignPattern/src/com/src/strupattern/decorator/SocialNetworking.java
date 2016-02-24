package com.src.strupattern.decorator;

public class SocialNetworking extends FeatureDecorator {

	BankAccount account;
	public SocialNetworking(BankAccount account) {
		super(account);
		this.account=account;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double balanceTomaintain() {
		// TODO Auto-generated method stub
		return account.balanceTomaintain()+8000.00;
	}
	public String prefPartner()
	{
		return "FaceBook";
	}
}
