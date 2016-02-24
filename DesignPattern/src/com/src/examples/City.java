package com.src.examples;

import java.util.ArrayList;
import java.util.List;

public class City implements Profitable {

	
	private String cityName;
	private List<Profitable> stores;
	
	
	public City(String cityName) {
		super();
		this.cityName = cityName;
		stores = new ArrayList<Profitable>();
	}

	@Override
	public double getProfit() {
    
		double profit = 0;
		for(Profitable obj:stores)
		{
			profit+=obj.getProfit();
		}
      return profit;
		
	}

	@Override
	public void addLeaf(Profitable leaf) {
		if(leaf instanceof Store)
			stores.add(leaf);
		
	}

	@Override
	public void removeLeaf(Profitable leaf) {
		if(leaf instanceof Store && stores.contains(leaf))
			stores.remove(leaf);
		
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Profitable> getStores() {
		return stores;
	}

	public void setStores(List<Profitable> stores) {
		this.stores = stores;
	}
	

}
