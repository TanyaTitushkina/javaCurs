package javaCurs.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class C6ex29_CoinTossing {

    private enum Coin {HEADS, TAILS};
    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headsNumber = 0;
        int tailsNumber = 0;

        System.out.print("Menu Options:");
        while (true) {
            System.out.println("\n 1 - Toss Coin");
            System.out.println(" 0 - Quit");

            System.out.print("\nChoose the option number: ");
            int optionCode = scanner.nextInt();

            if (optionCode == 0) {
                break;
            } else if (optionCode == 1) {
                Coin coin = flip();
                if(Coin.HEADS == coin) {
                    headsNumber++;
                } else {
                    tailsNumber++;
                }
            } else {
                System.out.println("\nWrong option number! Please, try once again.");
                continue;
            }
        }
        System.out.println("********************************************");
        System.out.println("Heads appeared " + headsNumber + " time(s)");
        System.out.println("Tails appeared " + tailsNumber + " time(s)");
    }

    public static Coin flip() {
        int coinSide = random.nextInt(2);
        if(coinSide == 1) {
            System.out.println("\nCoin side is: " + Coin.HEADS);
            System.out.println("-------------------------");
            return Coin.HEADS;
        } else {
            System.out.println("\nCoin side is: " + Coin.TAILS);
            System.out.println("-------------------------");
            return Coin.TAILS;
        }
    }
}
