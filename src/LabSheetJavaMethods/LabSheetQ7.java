package LabSheetJavaMethods;

import java.util.Scanner;

public class LabSheetQ7 {
    public static void sumOfEvenAndOdd(int lowerBound, int upperBound) {
        int sumEven = 0, sumOdd = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) { // even number
                sumEven += i;
            } else { // odd number
                sumOdd += i;
            }
        }

        int absoluteDiff = Math.abs(sumEven - sumOdd);

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Absolute difference: " + absoluteDiff);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int lowerBound = input.nextInt();
        System.out.print("Enter upper bound: ");
        int upperBound = input.nextInt();
        sumOfEvenAndOdd(lowerBound, upperBound);
        input.close();
    }
}
