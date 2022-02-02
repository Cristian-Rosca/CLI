package com.bnta;

import java.util.Locale;
import java.util.Scanner;

public class bookFlight {
    public static void main(String[] args) {
        System.out.println("Would you like to see our destinations? (Type 'Y'/'N')");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("y")) {
            System.out.println("Our destinations are: Canada, Berlin, and London.");
            System.out.println("Which destination would you like to go? (Type one of the above)");
                    String input = scanner.nextLine().toLowerCase();

        }
        else if (answer.equals("N")){
            System.out.println("Thank you for using our service. Come back next time.");

        }
        else {
            System.out.println("Invalid input. Try again.");
        }
    }

    // If answer = yes
        // print Canada, Berlin, London
            // Which flight would you like to take? (choose one of 3)
                // Run check to see if there is capacity
            // Or exit program

    }

