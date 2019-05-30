package javaCurs.chapter2;

import java.util.Scanner;

public class C2ex26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st integer:");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd integer:");
        int num2 = scanner.nextInt();

        if (num2 != 0) {
            if (num1 % num2 == 0) {
                System.out.printf("%d is a multiple of %d.", num1, num2);
            } else System.out.printf("%d is not a multiple of %d.", num1, num2);
        } else System.out.println("The 2nd integer is equal to 0. Devision by 0 is prohibited!");
    }
}
