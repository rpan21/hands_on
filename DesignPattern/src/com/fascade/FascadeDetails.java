package com.fascade;

import java.util.HashMap;

public class FascadeDetails {

	HashMap<String, String> details = new HashMap<String, String>();


	private HashMap<String, String> getFlightDetails() {
		
		FlightDetails obj = new FlightDetails();
		obj.init();
		return obj.getFlights();
	}
	
   private HashMap<String, String> getHotelDetails() {
		
		HotelDetails obj = new HotelDetails();
		obj.init();
		return obj.getHotels();
	}
   public HashMap<String, String> getDetails(){
	   details.putAll(getFlightDetails());
	   details.putAll(getHotelDetails());
	   
	   return details;
   }
}
