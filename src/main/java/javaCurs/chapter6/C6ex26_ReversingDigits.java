package javaCurs.chapter6;

import java.util.Scanner;

public class C6ex26_ReversingDigits {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        System.out.println("The same number, but with digits reversed: " + reverse(digit));
    }

    public static int reverse(int digit) {
        int reversedDigit = 0;
        while (digit > 0) {
            reversedDigit = reversedDigit * 10 + digit % 10;
            digit /= 10;
        }
        return reversedDigit;
    }
}
