package javaCurs.chapter2;

import java.util.Scanner;

public class C2ex32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int negativeNumbers = 0;
        int positiveNumbers = 0;
        int zeroNumbers = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter integer nr." + (i+1));
            int num = scanner.nextInt();
            if(num < 0) {
                negativeNumbers++;
            }
            if(num > 0) {
                positiveNumbers++;
            }
            if(num == 0) {
                zeroNumbers++;
            }
        }
        System.out.printf("Number of negative numbers = %d%n", negativeNumbers);
        System.out.printf("Number of positive numbers = %d%n", positiveNumbers);
        System.out.printf("Number of zero numbers = %d%n", zeroNumbers);
    }
}
