package com.src.strupattern.decorator;

/**
 * 
 * Decorator
 *
 */
public abstract class FeatureDecorator extends BankAccount {

	private BankAccount account;

	public FeatureDecorator(BankAccount account) {
		super();
		this.account = account;
	}
	
}
