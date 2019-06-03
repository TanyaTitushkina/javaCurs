package javaCurs.chapter6;

import java.util.Scanner;

public class C6ex20_CircleArea {

    public static void main(String[] args) {

        System.out.print("Enter circle radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.printf("The circle area = %.2f%n", circleArea(radius));
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
