package com.src.examples;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Store s1 =new Store(12000, "Ratu Road");
		Store s2 = new Store(19097, "Piska More");

		Store s3 = new Store(19097, "Lalpur");
		
		City ranchi = new City("Ranchi");
		ranchi.addLeaf(s1);
		ranchi.addLeaf(s2);
		
		ranchi.addLeaf(s3);
		
		System.out.println("Total Collection for "+ ranchi.getCityName()+" :\t\t" + ranchi.getProfit());
		
		Store s4 =new Store(13000, "adityapur Road");
		Store s5 = new Store(19457, "Kadma More");

		Store s6 = new Store(1197, "Champran");
		
		City jsr = new City("Jamshedpur");
		jsr.addLeaf(s4);
		jsr.addLeaf(s5);
		
		jsr.addLeaf(s6);
		System.out.println("Total Collection for "+ jsr.getCityName()+" :\t" + jsr.getProfit());
		State jharkhand = new State("Jharkhand");
		jharkhand.addLeaf(jsr);
		jharkhand.addLeaf(ranchi);
		System.out.println("============================================================");
		System.out.println("Total Collection for "+ jharkhand.getStateName()+" :\t" + jharkhand.getProfit());
		jsr.removeLeaf(s6);
		System.out.println("Total Collection for "+ jharkhand.getStateName()+" :\t" + jharkhand.getProfit());
	}

}
