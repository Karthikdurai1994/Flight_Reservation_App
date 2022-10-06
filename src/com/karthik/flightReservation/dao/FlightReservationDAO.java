package com.karthik.flightReservation.dao;

import com.karthik.flightReservation.model.Reservation;

public interface FlightReservationDAO {
    Reservation bookFlight(Reservation reservation);
    Reservation checkIn(long reservationID, int bagsCount);
}
