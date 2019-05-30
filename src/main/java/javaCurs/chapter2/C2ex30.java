package javaCurs.chapter2;

import java.util.Scanner;

public class C2ex30 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isNumberValid = false;

        while(!isNumberValid) {
            System.out.println("Enter a number consisting of 5 digits: ");
            num = scanner.nextInt();

            if(num / 10000 > 9 || num / 10000 == 0) {
                System.out.println("The entered number has a wrong number of digits!\nTry once again!\n");
                isNumberValid = false;
            } else isNumberValid = true;
        }

        // Printing entered number dividing by digits
        System.out.print(num / 10000 + "   ");
        num = num % 10000;
        System.out.print(num / 1000 + "   ");
        num = num % 1000;
        System.out.print(num / 100 + "   ");
        num = num % 100;
        System.out.print(num / 10 + "   ");
        num = num % 10;
        System.out.print(num / 1);

    }
}
