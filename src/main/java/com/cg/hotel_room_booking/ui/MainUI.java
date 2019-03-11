package com.cg.hotel_room_booking.ui;

import java.util.Scanner;

import com.cg.hotel_room_booking.beans.CustomerDetails;
import com.cg.hotel_room_booking.service.CustomerService;
import com.cg.hotel_room_booking.service.CustomerServiceImpl;

public class MainUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerDetails customerDetails = new CustomerDetails();
		CustomerService customerService = new CustomerServiceImpl();
		do {
			System.out.println("1) Book Room\n2) View Booking Status\n3) Exit");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Enter Customer Name");
				customerDetails.setCustomerName(sc.next());
				System.out.println("Enter Email");
				customerDetails.setCustomerEmail(sc.next());
				System.out.println("Enter Customer Address");
				customerDetails.setCustomerAddress(sc.next());
				System.out.println("Enter Mobile Number");
				customerDetails.setMobile(sc.nextLong());
				System.out.println("Room Number");
				customerDetails.setRoomNo(sc.nextInt());
				System.out.println("Room Type");
				customerDetails.setRoomType(sc.next());
				int newCustomerId = customerService.bookCustomer(customerDetails);
				if (newCustomerId != 0)
					System.out.println("Your room has been successfully booked. Your CustomerId is: " + newCustomerId);
				break;

			case 2:
				System.out.println("Enter Customer ID");
				int customerId = sc.nextInt();
				customerDetails = customerService.getCustomerDetails(customerId);
				if (customerDetails != null) {
					System.out.println("Name of the customer: " + customerDetails.getCustomerName());
					System.out.println("BOOKED");
					System.out.println("Room No: " + customerDetails.getRoomNo());
					System.out.println("Room Type: " + customerDetails.getRoomType());
				}
				break;

			case 3:
				System.exit(0);
				break;

			default:
				System.err.println("Invalid Choice");
				break;
			}
		} while (true);

	}

}
