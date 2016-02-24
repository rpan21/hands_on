package com.src.examples;

public interface Profitable {

	public double getProfit();
	public void addLeaf(Profitable leaf);
	public void removeLeaf(Profitable leaf);
	
	
}
