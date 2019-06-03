package javaCurs.chapter5;

import java.util.Scanner;

public class C5ex11_FindSmallestValue {

    public static void main(String[] args) {

        System.out.print("How much integers you want to enter? ");
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        System.out.print("\nEnter integer nr.1: ");
        int num = scanner.nextInt();
        int min = num; // there is only 1 number at the beginning and it is considered like the smallest

        for (int i = 1; i < counter; i++){
            System.out.print("Enter integer nr." + (i+1) + ": ");
            num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println("\nThe smallest integer = " + min);
    }
}
