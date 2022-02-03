package com.bnta.flight;

import com.bnta.passenger.Passengers;

import java.util.Arrays;
import java.util.Objects;

public class Flight {
    private Destination destination;
    private int maxCapacity;
    private Passengers[] passengers;

    public Flight(Destination destination,
                  int maxCapacity) {
        this.destination = destination;
        this.maxCapacity = maxCapacity;
        this.passengers = new Passengers[maxCapacity];
    }




    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Passengers[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flights = (Flight) o;
        return maxCapacity == flights.maxCapacity && destination == flights.destination && Arrays.equals(passengers, flights.passengers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(destination, maxCapacity);
        result = 31 * result + Arrays.hashCode(passengers);
        return result;
    }

    @Override
    public String toString() {
        return "com.bnta.Flights{" +
                "destination=" + destination +
                ", maxCapacity=" + maxCapacity +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
