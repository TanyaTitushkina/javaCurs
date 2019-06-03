package javaCurs.chapter5;

import java.util.Scanner;

public class C5ex17_CalculatingSales {

    public static void main(String[] args) {

        double priceProduct1 = 2.98;
        double priceProduct2 = 4.50;
        double priceProduct3 = 9.98;
        double priceProduct4 = 4.49;
        double priceProduct5 = 6.87;
        double totalSold = 0.00;
        String answer = "y";

        Scanner scanner = new Scanner(System.in);

        while(!answer.equals("n")) {

            System.out.print("Enter a product number (must be between 1 and 5) : ");
            int productNumber = scanner.nextInt();
            if (productNumber < 1 || productNumber > 5) {
                System.out.println("Invalid product number! Please, try once again.\n");
                continue;
            }

            System.out.print("Enter the quantity sold (Product " + productNumber + ") : ");
            int quantitySold = scanner.nextInt();
            if (quantitySold < 0) {
                System.out.println("Invalid quantity! Please, try once again.\n");
                System.out.print("Enter the quantity sold (Product " + productNumber + ") : ");
                quantitySold = scanner.nextInt();
            }

            switch(productNumber) {
                case 1:
                    totalSold += quantitySold * priceProduct1;
                    break;
                case 2:
                    totalSold += quantitySold * priceProduct2;
                    break;
                case 3:
                    totalSold += quantitySold * priceProduct3;
                    break;
                case 4:
                    totalSold += quantitySold * priceProduct4;
                    break;
                case 5:
                    totalSold += quantitySold * priceProduct5;
                    break;
                default:
                    break;
            }
            System.out.println("\nDo you want to enter info about other products? (y/n)");
            answer = scanner.next();
        }
        System.out.println("*******************************************************");
        System.out.printf("Total retail value of all products sold = $%.2f", totalSold);
    }
}
