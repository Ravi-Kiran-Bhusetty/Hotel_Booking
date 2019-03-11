package com.cg.hotel_room_booking.exceptions;

public class InvalidRoomNoException extends Exception{

	public InvalidRoomNoException() {
		System.err.println("Room number not available");
	}
}
