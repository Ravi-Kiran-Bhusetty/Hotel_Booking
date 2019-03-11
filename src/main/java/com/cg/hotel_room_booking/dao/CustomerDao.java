package com.cg.hotel_room_booking.dao;

import java.util.HashMap;

import com.cg.hotel_room_booking.beans.CustomerDetails;
import com.cg.hotel_room_booking.service.CustomerService;

public interface CustomerDao {

	int bookCustomer(CustomerDetails customerDetails);
	CustomerDetails getCustomerDetails(int customerId);
}
