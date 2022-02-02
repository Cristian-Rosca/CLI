package com.bnta.passenger;

import java.util.Objects;

public class Passengers {
    private String firstName;
    private String lastName;
    private String passportId;
    private String email;
    private TicketType ticketType;


    public Passengers(String firstName,
                      String lastName,
                      String passportId,
                      String email,
                      TicketType ticketType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.email = email;
        this.ticketType = ticketType;
    }

    // Created constructor where we can create passenger without TicketType enum input
    public Passengers(String firstName,
                      String lastName,
                      String passportId,
                      String email
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        return "com.bnta.Passengers{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportId='" + passportId + '\'' +
                ", email='" + email + '\'' +
                ", ticketType=" + ticketType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passengers that = (Passengers) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(passportId, that.passportId) && Objects.equals(email, that.email) && ticketType == that.ticketType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, passportId, email, ticketType);
    }
}
