package LabSheetJavaMethods;
import java.util.Scanner;
public class LabSheetQ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int reversedNum = reverseNumber(num);
        System.out.println("The reverse is: " + reversedNum);
        input.close();
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num = num / 10;
        }
        return reversedNum;
    }
}
