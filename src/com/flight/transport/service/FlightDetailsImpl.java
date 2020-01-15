package com.flight.transport.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.flight.transport.model.FlightDetails;
import com.flight.transport.model.OrderDetails;

public class FlightDetailsImpl implements FlightDetailsService {

	@Override
	public List<FlightDetails> fetchflightDetails() {

		List<FlightDetails> flightList = new ArrayList<>();

		FlightDetails flight1 = new FlightDetails("1", 1, "YYZ", "YUL");
		FlightDetails flight2 = new FlightDetails("2", 1, "YYC", "YUL");
		FlightDetails flight3 = new FlightDetails("3", 1, "YVR", "YUL");
		FlightDetails flight4 = new FlightDetails("4", 2, "YYZ", "YUL");
		FlightDetails flight5 = new FlightDetails("5", 2, "YYC", "YUL");
		FlightDetails flight6 = new FlightDetails("6", 2, "YVR", "YUL");

		flightList.add(flight1);
		flightList.add(flight2);
		flightList.add(flight3);
		flightList.add(flight4);
		flightList.add(flight5);
		flightList.add(flight6);

		return flightList;

	}

	@Override
	public List<OrderDetails> displayOrderDetails(String location) {
		byte[] files = null;
		try {
			files = Files.readAllBytes(Paths.get(location));
		} catch (IOException e) {
			System.err.println("File not found, Please enter correct location");
			return new ArrayList<>();
		}
		List<FlightDetails> flightList = fetchflightDetails();
		JSONObject json = new JSONObject(new String(files));

		int counter = 0;

		List<OrderDetails> orderDetailsList = new ArrayList<>();

		for (FlightDetails flightDetails : flightList) {
			if (flightDetails.getArrival().equals("YYZ")) {
				counter = 0;
				for (String orderDetails : json.keySet()) {
					if (json.get(orderDetails).toString().contains("YYZ") && !orderDetailsList.toString().contains(orderDetails)) {
						OrderDetails details = new OrderDetails(orderDetails, flightDetails.getFlightNo(),
								flightDetails.getDeparture(), flightDetails.getArrival(),
								String.valueOf(flightDetails.getDay()));
						orderDetailsList.add(details);
						counter++;
						if(counter == 20 ) {
							break;
						}
					}
					
				}
			}
			if (flightDetails.getArrival().equals("YYC")) {
				counter = 0;
				for (String orderDetails : json.keySet()) {
					if (json.get(orderDetails).toString().contains("YYC") && !orderDetailsList.toString().contains(orderDetails)) {
						OrderDetails details = new OrderDetails(orderDetails, flightDetails.getFlightNo(),
								flightDetails.getDeparture(), flightDetails.getArrival(),
								String.valueOf(flightDetails.getDay()));
						orderDetailsList.add(details);
						counter++;
						if(counter == 20 ) {
							break;
						}
					}
				
				}
			}
			if (flightDetails.getArrival().equals("YVR")) {
				counter = 0;
				for (String orderDetails : json.keySet()) {
					if (json.get(orderDetails).toString().contains("YVR") && !orderDetailsList.toString().contains(orderDetails)) {
						OrderDetails details = new OrderDetails(orderDetails, flightDetails.getFlightNo(),
								flightDetails.getDeparture(), flightDetails.getArrival(),
								String.valueOf(flightDetails.getDay()));
						orderDetailsList.add(details);
						counter++;
						if(counter == 20 ) {
							break;
						}
					}
				}

			}
		}

		return orderDetailsList;
	}

}
