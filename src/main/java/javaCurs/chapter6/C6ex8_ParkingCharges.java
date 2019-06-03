package javaCurs.chapter6;

import java.util.Scanner;

public class C6ex8_ParkingCharges {

    public static void main(String[] args) {

        double totalCharges = 0.0;
        int counter = 1;
        String answer = "y";

        Scanner scanner = new Scanner(System.in);

        while(!answer.equals("n")) {
            System.out.print("Enter parked hours for Customer nr." + counter + ": ");
            double parkedHours = scanner.nextDouble();

            if (parkedHours > 24) {
                System.out.println("No car parks for longer than 24 hours at a time!\n");
                System.out.print("Enter parked hours for Customer nr." + counter + ": ");
                parkedHours = scanner.nextDouble();
            }

            double charge = calculateCharges(parkedHours);

            System.out.printf("Charge for Customer nr.%d = $%.2f %n", counter, charge);
            totalCharges += charge;
            System.out.printf("\nThe running total of yesterday's receipts = $%.2f %n", totalCharges);

            System.out.println("\nDo you want to enter info about another Customer? (y/n)");
            answer = scanner.next();
            counter++;
        }
    }

    public static double calculateCharges(double hours) {
        double charge = 0.0;
        if(hours > 18.0) {
            return 10.0;
        } else if (hours > 3.00) {
            charge = 2.00 + (hours - 3.0) * 0.5;
        } else if (hours <= 3.0) {
            return 2.0;
        }
        return charge;
    }
}
