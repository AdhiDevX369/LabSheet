package LabSheetSequencialControlStructure;

import java.util.Scanner;

public class LabSheetQ4 {
    // To convert temperature from Celsius to Fahrenheit with validations error
    // occurs when input is not a number
public static double celsiusToFahrenheit(double celsius) {
    return (9.0 / 5) * celsius + 32;
}
public static double fahrenheitToCelsius(double fahrenheit) {
    return (5.0 / 9) * (fahrenheit - 32);
}

    public static void main(String[] args) {
        double temperature;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Tempeture: ");
        if (input.hasNextDouble()) {
            temperature = input.nextDouble();
            System.out.println("Enter Your Choice: ");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(temperature));
                    break;
                case 2:
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(temperature));
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}