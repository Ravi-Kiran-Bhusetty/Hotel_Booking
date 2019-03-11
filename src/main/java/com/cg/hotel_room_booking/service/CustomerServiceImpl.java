package com.cg.hotel_room_booking.service;

import java.util.HashMap;

import com.cg.hotel_room_booking.beans.CustomerDetails;
import com.cg.hotel_room_booking.dao.CustomerDao;
import com.cg.hotel_room_booking.dao.CustomerDaoImpl;
import com.cg.hotel_room_booking.exceptions.BookingStatusException;
import com.cg.hotel_room_booking.exceptions.CustomerNotExistingException;
import com.cg.hotel_room_booking.exceptions.InvalidRoomNoException;
import com.cg.hotel_room_booking.exceptions.InvalidRoomTypeException;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao customerDao = new CustomerDaoImpl();

	public int bookCustomer(CustomerDetails customerDetails) {
		int i = customerDao.bookCustomer(customerDetails);
		if (i == 1) {
			try {
				throw new InvalidRoomTypeException();
			} catch (InvalidRoomTypeException e) {
				return 0;
			}
		} else if (i == 0) {
			try {
				throw new BookingStatusException();
			} catch (BookingStatusException e) {
				return 0;
			}
		} else if (i == -1) {
			try {
				throw new InvalidRoomNoException();
			} catch (InvalidRoomNoException e) {
				return 0;
			}
		} else {
			return i;
		}
	}

	public CustomerDetails getCustomerDetails(int customerId) {
		CustomerDetails cd = customerDao.getCustomerDetails(customerId);
		if (cd != null)
			return cd;
		else {
			try {
				throw new CustomerNotExistingException();
			} catch (CustomerNotExistingException e) {
				return null;
			}
			
		}

	}

}
