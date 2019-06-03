package javaCurs.chapter6;

import java.util.Scanner;

public class C6ex22_TemperatureConversions {

    public static void main(String[] args) {

        String answer = "y";

        while(!answer.equals("n")) {
            System.out.println("If you want to enter a Fahrenheit temperature - please, enter 'f'\nIf you want to enter a Celsius temperature - please, enter 'c'");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.next();

            if (answer.equals("f")) {
                System.out.print("Enter a Fahrenheit temperature: ");
                int fahrenheit = scanner.nextInt();
                System.out.print("Celsius equivalent = ");
                celsius(fahrenheit);
            } else if (answer.equals("c")) {
                System.out.print("Enter a Celsius temperature: ");
                int celsius = scanner.nextInt();
                System.out.print("Fahrenheit equivalent = ");
                fahrenheit(celsius);
            } else {
                System.out.println("\nWrong option! Please, try once again.\n");
                continue;
            }
            System.out.println("\nDo you want to enter another temperature? (y/n)");
            answer = scanner.next();
        }
    }

    public static void celsius(int fahrenheit) {
        System.out.println(5.0 / 9.0 * (fahrenheit - 32));
    }

    public static void fahrenheit(int celsius) {
        System.out.println(9.0 / 5.0 * celsius + 32);
    }
}
