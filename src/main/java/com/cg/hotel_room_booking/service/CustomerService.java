package com.cg.hotel_room_booking.service;

import java.util.HashMap;

import com.cg.hotel_room_booking.beans.CustomerDetails;

public interface CustomerService {

	int bookCustomer(CustomerDetails customerDetails);
	CustomerDetails getCustomerDetails(int customerId);
}
