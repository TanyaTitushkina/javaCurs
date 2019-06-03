package javaCurs.chapter7;

import java.util.Scanner;

public class C7ex12_DuplicateElimination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        int counter = 0;
        while(counter < 5) {
            System.out.print("Enter a number between 10 and 100, inclusive: ");
            int number = scanner.nextInt();

            if(number >= 10 && number <= 100) {
                numbers[counter] = number;

                if(isUnique(numbers, number, counter)) {
                    System.out.println("Number " + number + " is unique!");
                } else {
                    System.out.println("Number " + number + " is not unique!");
                    numbers[counter] = 0; //duplicate number is marked it like 0
                }

                System.out.println("\n===Complete set of unique values===");
                displayUniqueNumbers(numbers);
                System.out.println();
                counter++;
            } else {
                System.out.println("Wrong number! Please, try once again.\n");
                continue;
            }
        }
    }

    public static boolean isUnique(int[] numbers, int number, int lastIndex) {
        for(int i = 0; i < lastIndex; i++) {
            if(number == numbers[i]) {
                return false;
            }
        } return true;
    }

    public static void displayUniqueNumbers(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}
