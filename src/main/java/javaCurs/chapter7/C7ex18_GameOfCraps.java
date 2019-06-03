package javaCurs.chapter7;

import java.security.SecureRandom;

public class C7ex18_GameOfCraps {

    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST};

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // plays one game of craps
    public static void main(String[] args)
    {
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST
        int[] winNum = new int[21];
        int[] lostNum = new int[21];

        for (int i = 0; i < 1000; i++) {
            int sumOfDice = rollDice(); // first roll of the dice

            // determine game status and point based on first roll
            switch (sumOfDice)
            {
                case SEVEN: // win with 7 on first roll
                case YO_LEVEN: // win with 11 on first roll
                    gameStatus = Status.WON;
                    ++winNum[1];
                    break;
                case SNAKE_EYES: // lose with 2 on first roll
                case TREY: // lose with 3 on first roll
                case BOX_CARS: // lose with 12 on first roll
                    gameStatus = Status.LOST;
                    ++lostNum[1];
                    break;
                default: // did not win or lose, so remember point
                    gameStatus = Status.CONTINUE; // game is not over
                    myPoint = sumOfDice; // remember the point
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }

            // while game is not complete
            int counter = 2;
            while (gameStatus == Status.CONTINUE) // not WON or LOST
            {
                sumOfDice = rollDice(); // roll dice again

                // determine game status
                if (sumOfDice == myPoint) { // win by making point
                    gameStatus = Status.WON;
                    ++winNum[counter];
                } else if (sumOfDice == SEVEN) {// lose by rolling 7 before point
                    gameStatus = Status.LOST;
                    ++lostNum[counter];
                }
                if(counter < 20) {
                    counter++;
                }
            }
            // display won or lost message
            if (gameStatus == Status.WON) {
                System.out.println("Player wins");
            } else {
                System.out.println("Player loses");
            }
        }
        int totalRolls = 0;
        int wonGames = 0;
        int lostGames = 0;

        System.out.println("************************************************************************************************************");
        System.out.println("a) How many games are won on the 1st roll, 2nd roll, ..., 20th roll and after the 20th roll?\n");
        for(int roll = 1; roll <= 20; roll++) {
            System.out.println("Won on the " + roll + " roll: " + winNum[roll]);
            totalRolls += winNum[roll] * roll;
            wonGames += winNum[roll];
        }

        System.out.println("\nb) How many games are lost on the 1st roll, 2nd roll, ..., 20th roll and after the 20th roll?\n");
        for(int roll = 1; roll <= 20; roll++)  {
            System.out.println("Lost on the " + roll + " roll: " + lostNum[roll]);
            totalRolls += lostNum[roll] * roll;
            lostGames += lostNum[roll];
        }

        System.out.println("\nc) What are the chances of winning at craps?\n");
        System.out.println("Chance to win " + ((double)wonGames * 100 / 1000) + "%");
        System.out.println("Chance to loose " + ((double)lostGames * 100 / 1000) + "%");

        System.out.println("\nd) What is the average length of a game of craps?\n");
        System.out.println("The average game's length = " + totalRolls / 1000);

        System.out.println("\ne) Do the chances of winning improve with the length of the game?\n");
        System.out.println("No");
    }

    // roll dice, calculate sum and display results
    public static int rollDice()
    {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2; // sum of die values

        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}
