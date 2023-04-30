package LabSheetSelectionControlStructure;
import java.util.Scanner;
public class LabSheetQ8 {
    public static void main(String[] args) {
      
        // Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
  
        // Checking divisibility
        if (number % 5 == 0 && number % 11 == 0) {
           System.out.println(number + " is divisible by 5 and 11.");
        } else {
           System.out.println(number + " is not divisible by 5 and 11.");
        }
     }
}
