package com.fascade;

import java.util.HashMap;

public class HotelDetails {

	HashMap<String, String> hotels ;

	public HotelDetails() {
		super();
		hotels = new HashMap<String,String>();
	}
	
	public void init()
	{
		hotels.put("Hotel Ashoka", "Ranchi");
		hotels.put("Hotel Madhuban", "Patna");
		
		hotels.put("Hotel urvashi", "Kolkata");
		
		hotels.put("Hotel Masurs", "Agra");
		
		hotels.put("Hotel D", "Mumbai");
		
	}
	
	public String getDetails(String key)
	{
		return hotels.get(key);
	}
	

	public HashMap<String, String> getHotels() {
		return hotels;
	}

	public void setFlights(HashMap<String, String> hotels) {
		this.hotels = hotels;
	}
}