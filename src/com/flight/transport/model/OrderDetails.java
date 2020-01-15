package com.flight.transport.model;

public class OrderDetails {
	
	private String order;
	private String flightNumber;
	private String departure ;
	private String arrival;
	private String day;
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public OrderDetails(String order, String flightNumber, String departure, String arrival, String day) {
		super();
		this.order = order;
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.arrival = arrival;
		this.day = day;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderDetails [order=" + order + ", flightNumber=" + flightNumber + ", departure=" + departure
				+ ", arrival=" + arrival + ", day=" + day + "]" + "\n";
	}
	
	
	
	

}
