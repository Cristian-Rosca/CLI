package com.bnta.flight;

import com.bnta.passenger.Passengers;
import com.bnta.passenger.TicketType;
import org.junit.jupiter.api.Test;


import java.util.Locale;
import java.util.Scanner;

import static com.bnta.flight.Destination.LONDON;
import static com.bnta.passenger.TicketType.first;
import static org.assertj.core.api.Assertions.assertThat;

class FlightServiceTest {

    @Test
    void addingPassengertoFlightArrayOfPassenger() {
        //Given
        // Here we created the objects and added properties

        // Imported FlightService Class (allowed us to use the addPassenger function)
        FlightService flightService = new FlightService();

        // Created sample passenger
        Passengers cristian = new Passengers(
                "Cristian",
                "Rosca",
                "123abs",
                "cr@gmail.com",
                first);


        // Created sample flight, without array of passenger i.e: empty array
        Flight flight = new Flight(LONDON, 3);


        // When
        // Invoking the addPassenger method and passing the sample passenger we created and sample flight
        // If there is space in the array of Passenger (i.e: if there is a null value), the passenger is added to the array
        flightService.addPassenger(cristian, flight);


        //Then
        // checks that the passenger was inserted into the target array (flight.getPassengers())
        assertThat(flight.getPassengers()).contains(cristian);
        // checks that the other space in the array are still null (flight.getPassengers())
        // In other words, we haven't filled each slot with the 1 passenger
        assertThat(flight.getPassengers()).containsNull();

    }

    @Test
    void addPassengerWithDifferentDetails() {
        //Given
        // Here we created the objects and added properties

        // Imported FlightService Class (allowed us to use the addPassenger function)
        FlightService flightService = new FlightService();

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("First name below:");
//        String firstName = scanner.nextLine();
//        System.out.println("Second name below:");
//        String lastName = scanner.nextLine();
//        System.out.println("Passport number below:");
//        String passportId = scanner.nextLine();
//        System.out.println("Email below:");
//        String email = scanner.nextLine();
//        System.out.println("Select your ticket type (Type: 'First', 'Business' or 'Economy')");
//        TicketType ticket = TicketType.valueOf(scanner.next().toLowerCase(Locale.ROOT));

        // Created sample passenger
        Passengers passengerA = new Passengers(
                "hauxkh`njw",
                "iu`hkxnjk",
                "12345w",
                "cr@gmail",
                first);


        // Created sample flight, without array of passenger i.e: empty array
        Flight flight = new Flight(LONDON, 3);


        // When
        //
        flightService.addPassenger(passengerA, flight);


        //Then

        assertThat(flight.getPassengers()).contains(passengerA);
        assertThat(flight.getPassengers()).containsNull();

    }

}