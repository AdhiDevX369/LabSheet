package LabSheetJavaMethods;

import java.util.Scanner;

public class LabSheetQ8 {
    public static int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
        int count = countVowels(inputString);
        System.out.println("Number of vowels: " + count);
        input.close();
    }

}
