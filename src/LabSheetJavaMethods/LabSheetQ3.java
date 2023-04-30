package LabSheetJavaMethods;
import java.util.Scanner;

public class LabSheetQ3 {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);
        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);
    }
}
