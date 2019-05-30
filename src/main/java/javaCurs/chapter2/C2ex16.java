package javaCurs.chapter2;

import java.util.Scanner;

public class C2ex16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd integer: ");
        int num2 = scanner.nextInt();

        if(num1 == num2) {
            System.out.println("These numbers are equal");
        }
        if(num1 > num2) {
            System.out.printf("%d is larger", num1);
        }
        if(num1 < num2) {
            System.out.printf("%d is larger", num2);
        }
    }
}
