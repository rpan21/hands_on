package com.fascade;

import java.util.HashMap;

public class FlightDetails {

	HashMap<String, String> flights ;

	public FlightDetails() {
		super();
		flights = new HashMap<String,String>();
	}
	
	public void init()
	{
		flights.put("G121", "Ranchi - Delhi");
		flights.put("G122", "Ranchi - Patna");
		
		flights.put("G123", "Ranchi - Kolkata");
		
		flights.put("G124", "Ranchi - Agra");
		
		flights.put("G125", "Ranchi - Mumbai");
		
	}
	
	public String getDetails(String key)
	{
		return flights.get(key);
	}

	public HashMap<String, String> getFlights() {
		return flights;
	}

	public void setFlights(HashMap<String, String> flights) {
		this.flights = flights;
	}
	
	
}
