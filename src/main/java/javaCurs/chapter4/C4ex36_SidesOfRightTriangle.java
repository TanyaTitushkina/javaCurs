package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex36_SidesOfRightTriangle {

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

        //a*a + b*b = c*c, b*b + c*c == a*a, c*c + a*a == b*b
        if(value1 * value1 + value2 * value2 == value3 * value3) {
            System.out.println("The entered values could represent the sides of a right triangle");
        } else if (value2 * value2 + value3 * value3 == value1 * value1) {
            System.out.println("The entered values could represent the sides of a right triangle");
        } else if (value3 * value3 + value1 * value1 == value2 * value2) {
            System.out.println("The entered values could represent the sides of a right triangle.");
        } else {
            System.out.println("The entered values could not represent the sides of a right triangle.");
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
