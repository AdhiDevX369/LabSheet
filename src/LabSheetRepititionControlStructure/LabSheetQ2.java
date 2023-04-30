package LabSheetRepititionControlStructure;
import java.util.Scanner;
public class LabSheetQ2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Number\tSquare\tCube");
        for(int i=1; i<=n; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t" + square + "\t" + cube);
        }
    }
}