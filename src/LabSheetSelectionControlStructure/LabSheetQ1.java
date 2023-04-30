package LabSheetSelectionControlStructure;
import java.util.Scanner;
public class LabSheetQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age <= 18) {
            System.out.println("You are under 18");
        } else {
            System.out.println("You are over 18");
        }
    }
}

