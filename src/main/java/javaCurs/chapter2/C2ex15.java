package javaCurs.chapter2;

import java.util.Scanner;

public class C2ex15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", difference);

        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.printf("Quotient is %d%n", quotient);
        }else {
            System.out.println("Devision by 0 is prohibited!");
        }
    }
}
