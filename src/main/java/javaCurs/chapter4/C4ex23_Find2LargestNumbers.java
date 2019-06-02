package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex23_Find2LargestNumbers {

    public static void main(String[] args) {
        int counter = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print(counter + ") Enter the number: ");
        int firstLargest = scanner.nextInt();
        int secondLargest = 0;

        while(counter < 10) {
            System.out.print(++counter + ") Enter the number: ");
            int number = scanner.nextInt();
            if(number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
        System.out.println("\n1st largest number = " + firstLargest);
        System.out.println("2nd largest number = " + secondLargest);
    }
}
