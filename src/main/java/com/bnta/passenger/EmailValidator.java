package com.bnta.passenger;

import java.util.Scanner;

public class EmailValidator {

    // Email validator - ensures that the users email input contains @ symbol
    public String validateEmail(String email) throws Exception {
        if (email.contains("@")) {
            return email;
        } else {
            throw new Exception("Invalid email. Email must contain '@' ");
        }

    }

}
