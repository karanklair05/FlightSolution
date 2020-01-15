package com.flight.transport;

import java.util.Scanner;

import com.flight.transport.service.FlightDetailsImpl;
import com.flight.transport.service.FlightDetailsService;

public class TransportApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FlightDetailsService flightService = new FlightDetailsImpl();
		int menuOption = 0;
		do {
			System.out.println("Welcome to Transport ");
			System.out.println("1. Display Flight Schedule ");
			System.out.println("2. Load Order details ");
			System.out.println("3. Exit ");
			menuOption = sc.nextInt();
			switch (menuOption) {
			case 1:
				System.out.println(flightService.fetchflightDetails());
				break;
			case 2:
				System.out.println("Enter json file location");
				String location = sc.next();
				System.out.println(flightService.displayOrderDetails(location));
				break;
			case 3:
				System.out.println("Thanks,have a good day");
				break;
			default:
				System.out.println("Please  enter valid input");
				break;
			}

		} while (menuOption != 3);

		sc.close();

	}

}
