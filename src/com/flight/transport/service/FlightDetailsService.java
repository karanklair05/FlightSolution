package com.flight.transport.service;

import java.util.List;

import com.flight.transport.model.FlightDetails;
import com.flight.transport.model.OrderDetails;

public interface FlightDetailsService {
	
	List<FlightDetails> fetchflightDetails();
	
	List<OrderDetails> displayOrderDetails(String location);

}
