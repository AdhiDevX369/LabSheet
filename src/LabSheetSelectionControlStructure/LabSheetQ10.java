package LabSheetSelectionControlStructure;
import java.util.Scanner;
public class LabSheetQ10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in rupees: ");
        int amount = input.nextInt();

        int thousand = amount / 1000;
        amount %= 1000;
        int fiveHundred = amount / 500;
        amount %= 500;
        int twoHundred = amount / 200;
        amount %= 200;
        int hundred = amount / 100;
        amount %= 100;
        int fifty = amount / 50;
        amount %= 50;
        int twenty = amount / 20;
        amount %= 20;
        int ten = amount / 10;
        amount %= 10;
        int five = amount / 5;
        amount %= 5;
        int two = amount / 2;
        int one = amount % 2;

        System.out.println("1000 Notes - " + thousand);
        System.out.println("500 Notes  - " + fiveHundred);
        System.out.println("200 Notes  - " + twoHundred);
        System.out.println("100 Notes  - " + hundred);
        System.out.println("50 Notes   - " + fifty);
        System.out.println("20 Notes   - " + twenty);
        System.out.println("10 Notes   - " + ten);
        System.out.println("5 Notes    - " + five);
        System.out.println("2 Coins    - " + two);
        System.out.println("1 Coins    - " + one);
    }

}
