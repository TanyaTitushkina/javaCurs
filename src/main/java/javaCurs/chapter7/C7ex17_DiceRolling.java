package javaCurs.chapter7;

import java.util.Random;

public class C7ex17_DiceRolling {

    public static void main(String[] args) {
        int[] sums = new int[13];
        int dice1;
        int dice2;
        Random random = new Random();

        for(int i = 0; i < 36000000; i++) {
            dice1 = 1 + random.nextInt(6);
            dice2 = 1 + random.nextInt(6);
            sums[dice1 + dice2]++;
        }

        System.out.println("Sum\t\t| Number of times");
        System.out.println("-------------------------");
        for(int i = 2; i < sums.length; i++) {
            System.out.println(i + "\t\t| " + sums[i]);
        }

    }
}
