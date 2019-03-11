package com.cg.hotel_room_booking.exceptions;

public class BookingStatusException extends Exception{

	public BookingStatusException() {
		System.err.println("Room Already Booked");
	}
}
