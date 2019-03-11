package com.cg.hotel_room_booking.exceptions;

public class InvalidRoomTypeException extends Exception{

	public InvalidRoomTypeException() {
		System.err.println("Room type for the entered room number doesn't match");
	}
}
