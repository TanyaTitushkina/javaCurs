package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex17_GasMileage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tripNumber = 1;
        String answer = "y";
        int totalMiles = 0;
        int totalGallons = 0;

        while(!answer.equals("n")) {
            System.out.println("Enter Miles for trip nr." + tripNumber);
            int tripMiles = scanner.nextInt();
            if(tripMiles <= 0){
                System.out.println("\nYou must enter positive values for Miles per trip.\nPlease, try once again.\n");
                System.out.println("Enter Miles for trip nr." + tripNumber);
                tripMiles = scanner.nextInt();
            }

            System.out.println("Enter Gallons for trip nr." + tripNumber);
            int tripGallons = scanner.nextInt();
            if(tripGallons <= 0){
                System.out.println("\nYou must enter positive values for Gallons per trip.\nPlease, try once again.\n");
                System.out.println("Enter Gallons for trip nr." + tripNumber);
                tripGallons = scanner.nextInt();
            }

            if (tripMiles > 0 && tripGallons > 0){
                System.out.println("\nMiles per gallon for trip nr." + tripNumber + " = " + (double) tripMiles / tripGallons);
                totalMiles += tripMiles;
                totalGallons += tripGallons;
                tripNumber++;
            }
            System.out.println("\nDo you want to enter information for next trip? (y/n)");
            Scanner inputAnswer = new Scanner(System.in);
            answer = inputAnswer.next();
            System.out.println();
        }

        if(totalMiles > 0 && totalGallons > 0) {
            System.out.println("************************************************");
            System.out.println("Combined miles per gallon for all trips = " + (double) totalMiles / totalGallons);
        }
    }
}
