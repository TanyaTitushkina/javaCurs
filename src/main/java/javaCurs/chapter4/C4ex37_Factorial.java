package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex37_Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter nonnegative number: ");
        int number = scanner.nextInt();
        number = validateNumber (number);
        System.out.println("\nFactorial: " + number + "! = " + factorial(number));

        System.out.println("Math constant e for " + number + " = " + countE(number));
        System.out.println("Math constant e raised to the power of " + number + " = " + countEx(number));
    }

    public static int factorial(int num) {
        if(num >= 1) {
            return num * factorial(num - 1);
        } else return 1;
    }

    public static double countE(int num) {
        double e = 1.00;
        for (int i = 1; i <= num; i++) {
            e = e + 1/(double) factorial(i);
        }
        return e;
    }

    public static double countEx(int num) {
        double ex = 1.00;
        for (int i = 1; i <= num; i++) {
            ex = ex + Math.pow(num, i) / (double) factorial(i);
        }
        return ex;
    }

    public static int validateNumber (int num){
        while (num < 0){
            System.out.println("Number must be >= 0. Please, try once again.\n");
            System.out.print("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        }
        return num;
    }
}
