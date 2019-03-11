package com.cg.hotel_room_booking.beans;

public class RoomDetails {

	private String roomType, status;

	public RoomDetails(String roomType, String status) {
		this.roomType = roomType;
		this.status = status;
	}

	public RoomDetails() {
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoom_type(String roomType) {
		this.roomType = roomType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
