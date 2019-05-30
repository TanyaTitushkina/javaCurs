package javaCurs.chapter2;

import java.util.Scanner;

public class C2ex25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.printf("%d is even number.", num);
        } else System.out.printf("%d is odd number.", num);

    }
}
