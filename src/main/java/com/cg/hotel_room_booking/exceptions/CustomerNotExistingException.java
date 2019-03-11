package com.cg.hotel_room_booking.exceptions;

public class CustomerNotExistingException extends Exception{

	public CustomerNotExistingException() {
		System.err.println("No registration in the name of entered customer id");
	}
}
