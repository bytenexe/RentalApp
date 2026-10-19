package com.pluralsight;

import java.util.Scanner;

public class RentalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Setting up our output statements
        // a. Pickup date (store as a string)
        System.out.print("When will you be picking up your vehicle? (Month, Day, Year): ");
        String pickup = scanner.nextLine();

        // b. Number of days for the rental
        System.out.print("How many days will you be renting: ");
        int rental = scanner.nextInt();
        scanner.nextLine();

        // c. Electronic toll tag ($3.95/day)
        System.out.print("Do you want an electronic toll tag ($3.95/day)? (Yes/No): ");
        String electronicTag = scanner.nextLine();

        // d. GPS ($2.95/day)
        System.out.print("Do you want a GPS ($2.95/day)? (Yes/No): ");
        String gps = scanner.nextLine();

        // e. Roadside assistance ($3.95/day)
        System.out.print("Do you want roadside assistance ($3.95/day)? (Yes/No): ");
        String roadsideChoice = scanner.nextLine();

        // f. Current age
        System.out.print("What's your current age?: ");
        int age = scanner.nextInt();

        // Calculations
        // a. Basic car rental ($29.99 per day)
        double basicCarRental = 29.99 * rental;

        // b. Option cost formm
        double optionsCost = 0.0;
        if (electronicTag.equals("yes")) {
            optionsCost += 3.95 * rental;
        } else {
            optionsCost += 3.95 * rental;

            // Underage Calculations
            double underageDriver = 0.0;
            if (age < 25) {
                underageDriver = basicCarRental * 0.30;
            }


        }
    }
}