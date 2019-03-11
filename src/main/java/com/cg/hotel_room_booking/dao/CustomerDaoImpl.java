package com.cg.hotel_room_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.hotel_room_booking.beans.CustomerDetails;
import com.cg.hotel_room_booking.beans.RoomDetails;
import com.cg.hotel_room_booking.service.CustomerService;

public class CustomerDaoImpl implements CustomerDao {

	Map<Integer, RoomDetails> roomMap;
	Map<Integer, CustomerDetails> customerMap = new HashMap<Integer, CustomerDetails>();
	Integer customerId = 1001;
	RoomDetails rd = new RoomDetails();
	
	public CustomerDaoImpl() {
		roomMap = new HashMap<Integer, RoomDetails>();
		roomMap.put(101, new RoomDetails("AC_SINGLE", "NOT_BOOKED"));
		roomMap.put(102, new RoomDetails("AC_SINGLE", "NOT_BOOKED"));
		roomMap.put(103, new RoomDetails("AC_DOUBLE", "NOT_BOOKED"));
		roomMap.put(201, new RoomDetails("NONAC_SINGLE", "NOT_BOOKED"));
		roomMap.put(202, new RoomDetails("NONAC_SINGLE", "NOT_BOOKED"));
		roomMap.put(203, new RoomDetails("NONAC_DOUBLE", "NOT_BOOKED"));
	}

	public int bookCustomer(CustomerDetails customerDetails) {

		if (roomMap.containsKey(customerDetails.getRoomNo())) {
			rd = roomMap.get(customerDetails.getRoomNo());
			if (rd.getStatus().equals("NOT_BOOKED")) {
				if (rd.getRoomType().equals(customerDetails.getRoomType())) {
					customerMap.put(customerId,
							new CustomerDetails(customerDetails.getCustomerName(), customerDetails.getCustomerEmail(),
									customerDetails.getCustomerAddress(), customerDetails.getMobile(),
									customerDetails.getRoomNo(), customerDetails.getRoomType()));
					customerId++;
					roomMap.replace(customerDetails.getRoomNo(),
							new RoomDetails(customerDetails.getRoomType(), "BOOKED"));
					
				} else {
					return 1;
				}
			} else {
					return 0;
			}
		} else {
				return -1;
		}
		return customerId - 1;
	}

	public CustomerDetails getCustomerDetails(int customerId) {

		if (customerMap.containsKey(customerId)) {
			
			return customerMap.get(customerId);
		}
		else
			return null;
		
	}

}
