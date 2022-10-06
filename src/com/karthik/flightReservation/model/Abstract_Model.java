package com.karthik.flightReservation.model;

// This class is sued baecause for classes - Flight, Passenger, Reservation share common ID field, so we are creating a seperate class here and this class will be extended by those 3 classes
public class Abstract_Model {
	private long ID;

	public long getID() {
		return ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}

}
