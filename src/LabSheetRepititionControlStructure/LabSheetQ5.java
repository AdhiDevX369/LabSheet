package LabSheetRepititionControlStructure;
import java.util.Scanner;
public class LabSheetQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the lowerbound and upperbound
        System.out.print("Enter the lowerbound: ");
        int lowerbound = input.nextInt();
        System.out.print("Enter the upperbound: ");
        int upperbound = input.nextInt();

        // Calculate the sum of numbers between lowerbound and upperbound
        int sum = 0;
        int count = 0;
        int sumOfSquares = 0;
        int sumOfOdds = 0;
        int sumOfEvens = 0;
        int number = lowerbound;

        while (number <= upperbound) {
            sum += number;
            sumOfSquares += number * number;

            if (number % 2 == 0) {
                sumOfEvens += number;
            } else {
                sumOfOdds += number;
            }

            count++;
            number++;
        }

        // Calculate the average
        double average = (double) sum / count;

        // Print the results
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The sum of squares is " + sumOfSquares);
        System.out.println("The sum of odds is " + sumOfOdds);
        System.out.println("The sum of evens is " + sumOfEvens);
        System.out.println("The absolute difference between sum of odds and evens is " + Math.abs(sumOfOdds - sumOfEvens));

        // Repeat the same using a do-while loop
        sum = 0;
        count = 0;
        sumOfSquares = 0;
        sumOfOdds = 0;
        sumOfEvens = 0;
        number = lowerbound;

        do {
            sum += number;
            sumOfSquares += number * number;

            if (number % 2 == 0) {
                sumOfEvens += number;
            } else {
                sumOfOdds += number;
            }

            count++;
            number++;
        } while (number <= upperbound);

        // Calculate the average
        average = (double) sum / count;

        // Print the results
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The sum of squares is " + sumOfSquares);
        System.out.println("The sum of odds is " + sumOfOdds);
        System.out.println("The sum of evens is " + sumOfEvens);
        System.out.println("The absolute difference between sum of odds and evens is " + Math.abs(sumOfOdds - sumOfEvens));
    }
}
