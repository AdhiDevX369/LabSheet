package LabSheetRepititionControlStructure;
import java.util.Scanner;
public class LabSheetQ7 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit + " ");
            num /= 10;
        }
    }
}
