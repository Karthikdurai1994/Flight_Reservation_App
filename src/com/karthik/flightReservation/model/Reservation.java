package com.karthik.flightReservation.model;

public class Reservation extends Abstract_Model {
	private Passenger passenger;
	private Flight flight;
	private long flightID;
	private int numberOfBags;
	private boolean checkedIn = false; // intially checkedIn is false and only afrer reservation, it will be true

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public long getFlightID() {
		return flightID;
	}

	public void setFlightID(long flightID) {
		this.flightID = flightID;
	}
	
	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	@Override
	public String toString() {
		return "Reservation [passenger=" + passenger + ", flight=" + flight + ", flightID=" + flightID
				+ ", numberOfBags=" + numberOfBags + ", checkedIn=" + checkedIn + "]";
	}

}
