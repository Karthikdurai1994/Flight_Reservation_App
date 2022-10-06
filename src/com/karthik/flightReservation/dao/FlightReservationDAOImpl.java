package com.karthik.flightReservation.dao;

import java.util.HashMap;
import com.karthik.flightReservation.model.Flight;
import com.karthik.flightReservation.model.Reservation;

public class FlightReservationDAOImpl implements FlightReservationDAO {

	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationID = 0; // for saving reservationID, for each reservation we will increment the reservationID
	
	public FlightReservationDAOImpl(){
		reservations = new HashMap<>(); // initializing reservations hashmap in constructor
		flights = new HashMap<>(); // initializing flights hashmap in constructor
		
		// Flight object 1
		Flight flight1 = new Flight();
		flight1.setID(74972);
		flight1.setFlightNumber("1343");
		flight1.setOperatingAirlines("Air India");
		flight1.setDepartureCity("Chennai");
		flight1.setArrivalCity("Pune");
		flight1.setDateAndTimeOfDeparture("06/10/2022 11:00 AM");
		flights.put(flight1.getID(), flight1);
		
		// Flight object 2
		Flight flight2 = new Flight();
		flight2.setID(74332);
		flight2.setFlightNumber("8635");
		flight2.setOperatingAirlines("Indigo");
		flight2.setDepartureCity("Mumbai");
		flight2.setArrivalCity("Hyderabad");
		flight2.setDateAndTimeOfDeparture("03/10/2022 08:00 PM");
		flights.put(flight2.getID(), flight2);
	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		Flight flight = flights.get(reservation.getFlightID());
		reservation.setFlight(flight);
		reservationID = reservationID+1;
		reservation.setID(reservationID);
		reservations.put(reservationID, reservation); // saving reservationID as key and reservation object as data in "reservations" hashmap
		return reservation;
	}

	@Override
	public Reservation checkIn(long reservationID, int bagsCount) {
		Reservation r = reservations.get(reservationID);
		r.setNumberOfBags(bagsCount);
		r.setCheckedIn(true); // After reservation, checkIn method is called, so it is made true
		return r;
	}
}
