package com.bnta.flight;

import com.bnta.passenger.Passengers;

import java.net.PasswordAuthentication;

public class FlightService {


// check how many passengers are on our flight
// then add passengers to the flight
    public void addPassenger(Passengers newPassenger, Flight flight) {
        for (int i = 0; i < flight.getPassengers().length; i++) {
            if (flight.getPassengers()[i] == null) {
                flight.getPassengers()[i] = newPassenger;
                break;
            }
            else {

            }
            
        }

    }
}
