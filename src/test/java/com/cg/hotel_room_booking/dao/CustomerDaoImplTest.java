package com.cg.hotel_room_booking.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.hotel_room_booking.beans.CustomerDetails;

class CustomerDaoImplTest {

	static CustomerDaoImpl customerDao;
	
	@BeforeAll
	public static void init() {
		customerDao = new CustomerDaoImpl();
	}
	@Test
	void testBookCustomer() {
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setCustomerName("Ravi");
		customerDetails.setCustomerEmail("ravi@");
		customerDetails.setCustomerAddress("HYD");
		customerDetails.setMobile(1234567890);
		customerDetails.setRoomNo(101);
		customerDetails.setRoomType("AC_SINGLE");
		assertEquals(1001, customerDao.bookCustomer(customerDetails));
	}

	@Test
	void testGetCustomerDetails() {
		assertEquals(null, customerDao.getCustomerDetails(1002));
	}

}
