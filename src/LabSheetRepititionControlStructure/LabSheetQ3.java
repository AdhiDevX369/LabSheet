package LabSheetRepititionControlStructure;
import java.util.Scanner;
public class LabSheetQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Multiplication table of " + n);
        for(int i=0; i<=10; i++) {
            int result = n * i;
            System.out.println(n + " X " + i + " = " + result);
        }
    }
}
