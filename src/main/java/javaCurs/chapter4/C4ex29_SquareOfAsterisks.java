package javaCurs.chapter4;

import java.util.Scanner;

public class C4ex29_SquareOfAsterisks {

    public static void main(String[] args) {
        int size = 0;
        while(size < 1 || size > 20) {
            System.out.print("Enter square side's size: ");
            Scanner scanner = new Scanner(System.in);
            size = scanner.nextInt();
            if (size < 1 || size > 20){
                System.out.println("Size must be between 1-20. Please, try once again.\n");
            }
        }

        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                if (i == 1 || i == size) {
                    System.out.print("*");
                } else if(j == 1 || j == size) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
