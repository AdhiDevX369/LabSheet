package LabSheetSequencialControlStructure;
import java.util.Scanner;

public class LabSheetQ3 {
    //Swapping Two Numbers

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, temp;
        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();
        System.out.println("Before Swapping: " + num1 + " " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping: " + num1 + " " + num2);
    }
}