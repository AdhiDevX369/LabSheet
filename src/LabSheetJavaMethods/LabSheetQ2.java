package LabSheetJavaMethods;
import java.util.Scanner;

public class LabSheetQ2 {
    public static int calculateCube(int num) {
        return num * num * num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int cube = calculateCube(num);
        System.out.println("The cube of " + num + " is " + cube);
    }
}
