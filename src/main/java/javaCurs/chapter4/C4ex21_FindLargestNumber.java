package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex21_FindLargestNumber {

    public static void main(String[] args) {
        int counter = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print(counter + ") Enter the number: ");
        int largest = scanner.nextInt(); //there is only 1 number at the beginning and it is considered like the largest

        while(counter < 10) {
            System.out.print(++counter + ") Enter the number: ");
            int number = scanner.nextInt();
            if(number > largest) {
                largest = number;
            }
        }
        System.out.println("\nThe largest number = " + largest);
    }
}
