package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex31_DecimalEquivalentOfBinaryNumber {

    public static void main(String[] args) {

        int decimalNum = 0;
        int counter = 1;

        System.out.print("Enter a binary number: ");
        Scanner scanner = new Scanner(System.in);
        int binaryNum = scanner.nextInt();

        while(binaryNum != 0) {
            decimalNum = decimalNum + (binaryNum % 10 * counter);
            binaryNum = binaryNum / 10;
            counter *= 2;
        }
        System.out.println("Its decimal equivalent = " + decimalNum);
    }
}
