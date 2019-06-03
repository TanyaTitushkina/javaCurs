package javaCurs.chapter5;

import java.util.Scanner;

public class C5ex16_BarChartPrinting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers between 1 and 30\n");

        for (int i = 0; i < 5; i++){
            System.out.print("Enter nr." + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 1 || numbers[i] > 30) {
                System.out.println("You should enter a number between 1 and 30! Please, try once again.\n");
                System.out.print("Enter nr." + (i+1) + ": ");
                numbers[i] = scanner.nextInt();
                continue;
            }
        }
        System.out.println();

        for(int num : numbers) {
            for(int n = 0; n < num; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
