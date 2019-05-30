package javaCurs.chapter2;

import java.util.Scanner;

public class C2ex24 {

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer nr.1");
        int min = scanner.nextInt(); // 1st number is considered like the min
        int max = min; // there is only 1 number at the beginning, so it is considered like the max, too

        for (int i = 1; i < 5; i++) {
            System.out.println("Enter integer nr." + (i+1));
            num = scanner.nextInt();
            if(num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }

        System.out.printf("The largest integer in the group is %d%n", max);
        System.out.printf("The smallest integer in the group is %d%n", min);
    }
}
