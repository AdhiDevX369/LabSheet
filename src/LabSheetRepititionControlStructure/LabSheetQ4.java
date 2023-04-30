package LabSheetRepititionControlStructure;
import java.util.Scanner;
public class LabSheetQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers (0 to stop): ");
        int evenSum = 0;
        int oddSum = 0;
        while(true) {
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            }
            if(num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}
