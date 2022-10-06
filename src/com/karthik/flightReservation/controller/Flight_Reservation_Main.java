package com.karthik.flightReservation.controller;

import com.karthik.flightReservation.dao.FlightReservationDAO;
import com.karthik.flightReservation.dao.FlightReservationDAOImpl;
import com.karthik.flightReservation.model.Passenger;
import com.karthik.flightReservation.model.Reservation;

public class Flight_Reservation_Main {
	
	void bookUserFlight(FlightReservationDAO dao) {
		Reservation reser = new Reservation(); // creating Reservation class instance
		Passenger p = new Passenger(); // creating Passenger class instance
		p.setID(23);
		p.setFirstName("Vignesh");
		p.setLastName("Rajan");
		p.setEmail("vicky@example.com");
		p.setPhone("4556233890");
		reser.setPassenger(p);
		reser.setFlightID(74332);
		Reservation flightReservationConfirmation = dao.bookFlight(reser); // first we are calling bookFlight method to book the flight
		System.out.println(flightReservationConfirmation);
		Reservation checkInConfirmation= dao.checkIn(flightReservationConfirmation.getID(), 4); // after booking, we are calling checkIn method 
		System.out.println(checkInConfirmation);
	}
	
	public static void main(String[] args) {
        FlightReservationDAO dao = new FlightReservationDAOImpl(); // Creating FlightReservationDAOImpl Object for performing the operations
        Flight_Reservation_Main f1 = new Flight_Reservation_Main();
        f1.bookUserFlight(dao);
	}
}
