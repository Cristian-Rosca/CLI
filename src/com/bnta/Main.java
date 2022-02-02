package com.bnta;

import com.bnta.flight.Destination;
import com.bnta.flight.Flight;
import com.bnta.flight.FlightService;
import com.bnta.passenger.EmailValidator;
import com.bnta.passenger.Passengers;
import com.bnta.passenger.TicketType;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our Flight booking system!");
// take input strings of the properties in the passenger class from the terminal and we want to print it out.
// Create scanner object

        // Creating Airport Object: Canada
        Flight canada = new Flight(Destination.CANADA, 3);


        // Creating Airport Object: Berlin
        Flight berlin = new Flight(Destination.BERLIN, 3);


        // Creating Airport Object: London
        Flight london = new Flight(Destination.LONDON, 3);

        Scanner scanner = new Scanner(System.in);

        // Scanners to take input for creating new passenger
        System.out.println("First name below:");
        String firstName = scanner.nextLine();
        System.out.println("Second name below:");
        String lastName = scanner.nextLine();
        System.out.println("Passport number below:");
        String passportId = scanner.nextLine();
        System.out.println("Email below:");
        String email = scanner.nextLine();
        System.out.println("Select your ticket type (Type: 'First', 'Business' or 'Economy')");
        TicketType ticket = TicketType.valueOf(scanner.next().toLowerCase(Locale.ROOT));


        // take in a string input for ticketType
        // convert the string input to enum using valueOf

//        TicketType.BUSINESS= scanner.nextLine();

        // passenger object
        Passengers passengerA = new Passengers(
                firstName, lastName,
                passportId,
                email,
                ticket);


        // Used to see created passenger details (won't be published in actual code)
        System.out.println(passengerA);

        FlightService flightService = new FlightService();

//        String answer = scanner.nextLine();
        System.out.println("Would you like to see our destinations? (Type 'y'/'n')");
        Scanner scanner2 = new Scanner(System.in);
        String answer = scanner2.nextLine();

        if (answer.equals("y")) {
            System.out.println("Our destinations are: 1) Canada, 2) Berlin, and 3) London." +
                    "Which destination would you like to go? Type '1', '2' or '3'to make selection");
                    int choiceDestination = scanner.nextInt();
                    Flight flightChoice = canada;
                    if (choiceDestination == 1) {
                        flightService.addPassenger(passengerA, canada);;
                    }
                    else if (choiceDestination == 2) {
                        flightService.addPassenger(passengerA, berlin);;
                    }
                    else if (choiceDestination == 3) {
                        flightService.addPassenger(passengerA, london);;
                    }

            System.out.println(canada);
            System.out.println(berlin);
            System.out.println(london);

        }
        else if (answer.equals("n")){
            System.out.println("Thank you for using our service. Come back next time.");
        }
        else {
            System.out.println("Invalid input. Try again.");
        }


    }








    }




