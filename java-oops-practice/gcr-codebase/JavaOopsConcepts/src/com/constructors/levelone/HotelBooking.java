package com.constructors.levelone;

public class HotelBooking {

	private String guestName;
	private String roomType;
	private int nights;
	
	//Default constructor
	public HotelBooking(){
		this.guestName = "Rajeev Rai";
		this.roomType = "Deluxe";
		this.nights = 2;
	}
	
	//parameterized constructors
	public HotelBooking(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	//copy constructor
	public HotelBooking(HotelBooking b) {
		this.guestName = b.guestName;
		this.roomType = b.roomType;
		this.nights = b.nights;
   }
   
	public String getData() {
	   return guestName + " " + roomType + " " + nights;
   }
   
   
  
}
