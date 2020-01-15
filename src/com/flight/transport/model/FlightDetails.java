package com.flight.transport.model;

public class FlightDetails {
	
	private String flightNo;
	private Integer day;
	private String arrival;
	private String Departure;
	
	
	
	public String getFlightNo() {
		return flightNo;
	}



	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}



	public Integer getDay() {
		return day;
	}



	public void setDay(Integer day) {
		this.day = day;
	}



	public String getArrival() {
		return arrival;
	}



	public void setArrival(String arrival) {
		this.arrival = arrival;
	}



	public String getDeparture() {
		return Departure;
	}



	public void setDeparture(String departure) {
		Departure = departure;
	}



	@Override
	public String toString() {
		return "FlightDetails [flightNo=" + flightNo + ", day=" + day + ", arrival=" + arrival + ", Departure="
				+ Departure + "]" + "\n";
	}



	public FlightDetails(String flightNo, Integer day, String arrival, String departure) {
		super();
		this.flightNo = flightNo;
		this.day = day;
		this.arrival = arrival;
		Departure = departure;
	}



	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
