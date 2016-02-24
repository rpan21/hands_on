package com.src.examples;

import java.util.ArrayList;
import java.util.List;

public class State implements Profitable{

	private String stateName;
	private List<Profitable> cities;
	
	public State(String stateName) {
		super();
		this.stateName = stateName;
		cities = new ArrayList<Profitable>();
	}

	@Override
	public double getProfit() {

		double profit = 0;
		for(Profitable obj:cities)
		{
			profit+=obj.getProfit();
		}
      return profit;
	}

	@Override
	public void addLeaf(Profitable leaf) {
		if(leaf instanceof City)
			cities.add(leaf);
		
	}

	@Override
	public void removeLeaf(Profitable leaf) {
		if(leaf instanceof City && cities.contains(leaf))
			cities.remove(leaf);
		
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<Profitable> getCities() {
		return cities;
	}

	public void setCities(List<Profitable> cities) {
		this.cities = cities;
	}

}
