package com.src.strupattern.decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc = new OnlineBanking(new SavingsAccount());
		
		System.out.println("Online Account Minimum amount : "+acc.balanceTomaintain());
		
		BankAccount acc1 = new SocialNetworking(new SavingsAccount());
		System.out.println("Social Networking Account Minimum amount : "+acc1.balanceTomaintain());
		//System.out.println("Preferred Partner is :" + acc1.prefPartner());
        BankAccount acc2 = new SavingsAccount();
		
		System.out.println("Saving Account Minimum amount : "+acc2.balanceTomaintain());
		
	}
	
	

}
