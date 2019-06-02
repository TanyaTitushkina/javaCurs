package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex30_Palindromes {

    public static void main(String[] args) {
        int n = 0;
        boolean isNumberValid = false;

        while(!isNumberValid) {
            System.out.print("Enter a 5 digits number: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            if(n / 10000 > 9 || n / 10000 == 0) {
                System.out.println("This number has a wrong number of digits! Please, try once again.\n");
                isNumberValid = false;
            } else {
                isNumberValid = true;
            }
        }

        String number = Integer.toString(n);
        if (number.charAt(0) == number.charAt(4)
                && number.charAt(1) == number.charAt(3)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }
}
