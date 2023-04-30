package LabSheetSelectionControlStructure;
import java.util.Scanner;
public class LabSheetQ9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter electricity unit charges: ");
        int units = input.nextInt();
        double billAmount = 0.0;

        if(units <= 50) {
            billAmount = units * 0.50;
        } else if(units <= 100) {
            billAmount = 50 * 0.50 + (units - 50) * 0.75;
        } else if(units <= 150) {
            billAmount = 50 * 0.50 + 50 * 0.75 + (units - 100) * 1.20;
        } else if(units > 150) {
            billAmount = 50 * 0.50 + 50 * 0.75 + 50 * 1.20 + (units - 150) * 1.50;
        }

        // calculate additional surcharge of 20%
        billAmount = billAmount + (billAmount * 0.20);

        System.out.println("Total Electricity Bill: Rs. " + billAmount);
    }
}
