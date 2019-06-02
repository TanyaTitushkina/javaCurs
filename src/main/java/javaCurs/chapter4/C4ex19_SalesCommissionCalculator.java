package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex19_SalesCommissionCalculator {

    final static double ITEM1 = 239.99;
    final static double ITEM2 = 129.75;
    final static double ITEM3 = 99.95;
    final static double ITEM4 = 350.89;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "y";
        double totalSales = 0;

        while(!answer.equals("n")) {
            System.out.print("Enter the index of the item sold (1-4) : ");
            int itemIndex = scanner.nextInt();

            if(itemIndex < 1 || itemIndex > 4) {
                System.out.println("The item's index should be in the range from 1 to 4 inclusive. Please try once again.\n");
                continue;
            } else {
                System.out.print("Enter the number of item" + itemIndex + " sold: ");
                int numOfItems = scanner.nextInt();
                if(numOfItems <= 0) {
                    System.out.println("\nThe number of items should greater than zero!\n");
                    continue;
                } else {
                    switch(itemIndex) {
                        case 1:
                            totalSales += ITEM1 * numOfItems;
                            break;
                        case 2:
                            totalSales += ITEM2 * numOfItems;
                            break;
                        case 3:
                            totalSales += ITEM3 * numOfItems;
                            break;
                        case 4:
                            totalSales += ITEM4 * numOfItems;
                            break;
                    }
                }
            }
            System.out.println("\nHave you sent other items during last week? (y/n)");
            Scanner inputAnswer = new Scanner(System.in);
            answer = inputAnswer.next();
            System.out.println();
        }
        if(totalSales > 0) {
            System.out.println("********************************************************");
            System.out.println("Salesperson's earnings = $" + (totalSales * 0.09 + 200));
        }
    }
}
