package com.pluralsight;

import java.util.Scanner;

public class RentalApp {
    public static void main(String[] args) {

        // Initialize variables for prices and price rates
        double dailyRate = 29.99;
        double tollTagRate = 3.95;
        double gpsRate = 2.95;
        double underageRate = 0.30;
        double roadsideRate = 3.95;

        Scanner scanner = new Scanner(System.in);

        // Setting up our output statements
        // a. Pickup date (store as a string)
        System.out.print("When will you be picking up your vehicle? (Month, Day, Year): ");
        String pickup = scanner.nextLine();

        // b. Number of days for the rental
        System.out.print("How many days will you be renting: ");
        int rental = Integer.parseInt(scanner.nextLine());

        // c. Electronic toll tag ($3.95/day)
        System.out.print("Do you want an electronic toll tag ($3.95/day)? (y/n): ");
        String electronicTag = scanner.nextLine().toLowerCase();


        // d. GPS ($2.95/day)
        System.out.print("Do you want a GPS ($2.95/day)? (y/n): ");
        String gps = scanner.nextLine().toLowerCase();


        // e. Roadside assistance ($3.95/day)
        System.out.print("Do you want roadside assistance ($3.95/day)? (y/n): ");
        String roadsideChoice = scanner.nextLine().toLowerCase();

        // f. Current age
        System.out.print("What's your current age?: ");
        int age = Integer.parseInt(scanner.nextLine());
        // Calculations

        // a. Basic car rental ($29.99 per day)
        double basicCarRental = dailyRate * rental;

        // b. Option cost
        double optionsCost = 0.0;

        switch (electronicTag) {
            case "y":
                optionsCost += tollTagRate * rental;
                break; // IMPORTANT: prevents fall-through
            case "n":
                // Do nothing; Skip
                break;
            default:
                // Just for invalid inputs
                break;
        }

        switch (roadsideChoice) {
            case "y":
                optionsCost += roadsideRate * rental;
                break;
            case "n":
                break;
            default:
                break;
        }

        switch (gps) {
            case "y":
                optionsCost += gpsRate * rental;
                break;
            case "n":
                break;
            default:
                break;

        }
        // c. Underage Driver Surcharge
        double underageDriver = 0.0;

        if (age < 25) {
            underageDriver += basicCarRental * underageRate;
        }

        // d. Total cost
        double totalCost = basicCarRental + optionsCost + underageDriver;

        System.out.println("Pickup date: " + pickup);
        System.out.println("Rental length: " + rental + " day(s)");
        System.out.printf("Basic car rental: $%.2f%n", basicCarRental);
        System.out.printf("Options cost: $%.2f%n", optionsCost);
        System.out.printf("Underage driver surcharge: $%.2f%n", underageDriver);
        System.out.printf("Total cost: $%.2f%n", totalCost);
    }
}