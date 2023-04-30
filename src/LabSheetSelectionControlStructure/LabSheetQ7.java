package LabSheetSelectionControlStructure;
import java.util.Scanner;
public class LabSheetQ7 {
    public static void main(String[] args) {
      
        // Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();
        System.out.print("Enter assignment mark: ");
        double assignment = input.nextDouble();
  
        // Checking eligibility
        if (attendance > 75 && assignment > 40) {
           System.out.println("Congratulations! You are eligible to sit for the exam.");
        } else {
           System.out.println("Sorry, you are not eligible to sit for the exam.");
        }
     }
}
