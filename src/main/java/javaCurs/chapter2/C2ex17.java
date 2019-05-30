package javaCurs.chapter2;

import java.util.Scanner;

public class C2ex17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter 3rd integer: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;
        int average = sum / 3;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Average is %d%n", average);

        // search for the smallest number
        if(num1 <= num2 && num1 <= num3) {
            System.out.printf("The smallest number is %d%n", num1);
        }
        if(num2 < num1 && num2 <= num3) {
            System.out.printf("The smallest number is %d%n", num2);
        }
        if(num3 < num1 && num3 < num2) {
            System.out.printf("The smallest number is %d%n", num3);
        }

        // search for the largest number
        if(num1 >= num2 && num1 >= num3) {
            System.out.printf("The largest number is %d%n", num1);
        }
        if(num2 > num1 && num2 >= num3) {
            System.out.printf("The largest number is %d%n", num2);
        }
        if(num3 > num1 && num3 > num2) {
            System.out.printf("The largest number is %d%n", num3);
        }
    }
}
