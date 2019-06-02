package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex35_SidesOfTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value nr.1: ");
        int value1 = scanner.nextInt();
        value1 = validateValue (value1);

        System.out.print("Enter value nr.2: ");
        int value2 = scanner.nextInt();
        value2 = validateValue (value2);

        System.out.print("Enter value nr.3: ");
        int value3 = scanner.nextInt();
        value3 = validateValue (value3);

        //The sum of lengths of any 2 triangle sides > 3rd side's length
        if (value1 + value2 > value3
            && value2 + value3 > value1
            && value3 + value1 > value2) {
                System.out.println("\nThe entered values could represent the sides of a triangle.");
        } else {
            System.out.println("\nThe entered values could not represent the sides of a triangle.");
        }
    }

    public static int validateValue (int value){
        while (value < 1){
            System.out.println("Value must be positive! Please, try once again.\n");
            System.out.print("Enter value: ");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();
        }
        return value;
    }
}
