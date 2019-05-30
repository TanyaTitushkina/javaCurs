package javaCurs.chapter2;

import java.util.Scanner;

public class C2ex28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int radius = scanner.nextInt();

        System.out.printf("Diameter of the circle = %d%n", 2 * radius);
        System.out.printf("Circumference of the circle = %f%n", 2 * Math.PI * radius);
        System.out.printf("Area of the circle = %f%n", Math.PI * radius * radius);
    }
}
