package LabSheetJavaMethods;

import java.util.Scanner;

public class LabSheetQ9 {
    public static void pensionContributionCalculator() {
        // read input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        double salary = scanner.nextDouble();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        // calculate contribution rates
        double employeeRate, employerRate;
        if (age <= 55) {
            employeeRate = 0.20;
            employerRate = 0.17;
        } else if (age <= 68) {
            employeeRate = 0.13;
            employerRate = 0.13;
        } else if (age <= 65) {
            employeeRate = 0.075;
            employerRate = 0.09;
        } else {
            // employee not eligible for pension
            System.out.println("Employee is not eligible for pension.");
            return;
        }

        // calculate contributions
        double employeeContribution = salary * employeeRate;
        double employerContribution = salary * employerRate;
        double totalContribution = employeeContribution + employerContribution;

        // print results
        System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
        System.out.printf("The total contribution is: $%.2f\n", totalContribution);
    }

    public static void main(String[] args) {
        pensionContributionCalculator();
    }
}
