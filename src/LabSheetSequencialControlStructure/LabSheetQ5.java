package LabSheetSequencialControlStructure;

import java.math.BigDecimal;
import java.util.Scanner;

public class LabSheetQ5 {

    public static void main(String[] args) {
        System.out.println("----------WELCOME TO THE CALCULATOR---------- "); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        System.out.print("Ex : 12 + 25 / 2: ");
        String expr = sc.nextLine();

        // split the expression into individual tokens
        String[] tokens = expr.split(" ");

        // convert the first token to a BigDecimal for the initial value
        BigDecimal result = new BigDecimal(tokens[0]);

        // loop through the rest of the tokens and perform the corresponding operation
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            BigDecimal operand = new BigDecimal(tokens[i+1]);

            switch (operator) {
                case "+":
                    result = result.add(operand);
                    break;
                case "-":
                    result = result.subtract(operand);
                    break;
                case "*":
                    result = result.multiply(operand);
                    break;
                case "/":
                    result = result.divide(operand);
                    break;
                default:
                    System.out.println("Invalid operator: " + operator);
                    System.exit(1);
            }
        }

        System.out.println("Result: " + result);
    }
}
