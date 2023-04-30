package LabSheetJavaMethods;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class LabSheetQ5 {

    public static void main(String[] args) {

        System.out.println("=====Hard Coded=====");
        int a = 5, b = 10, c = 7; // example values, can be changed
        int max = getMax(a, b, c);
        System.out.println("The maximum value is: " + max);

        System.out.println("=====User Input=====");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        max = getMax(x, y, z);
        System.out.println("The maximum value is: " + max);

        System.out.println("=====Random=====");

        int rand1 = (int) (Math.random() * 100);
        int rand2 = (int) (Math.random() * 100);
        int rand3 = (int) (Math.random() * 100);
        max = getMax(rand1, rand2, rand3);
        System.out.println("The maximum value is: " + max);
    }

    public static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
