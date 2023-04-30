package LabSheetJavaMethods;
import java.util.Scanner;

public class LabSheetQ10 {
    public static boolean isValidPassword(String password) {
        // Check length
        if (password.length() < 6) {
            System.out.println("A password must have at least 6 characters.");
            return false;
        }
        // Check for non-alphanumeric characters
        if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("A password consists of only letters and digits.");
            return false;
        }
        // Check for at least two digits
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            System.out.println("A password must contain at least two digits.");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        }
    }
        
}
