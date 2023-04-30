package LabSheetJavaMethods;
import java.util.Scanner;

public class LabSheetQ4{
    public static void printSquareAndCube(int lowerbound, int upperbound) {
        for (int i = lowerbound; i <= upperbound; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t" + square + "\t" + cube);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upperbound: ");
        int upperbound = sc.nextInt();
        printSquareAndCube(1, upperbound);
    }
}