package javaCurs.chapter6;

import java.util.Scanner;

public class C6ex19_DisplayingSquareOfAnyCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter square's side size: ");
        int side = scanner.nextInt();

        System.out.print("Enter square's fill character: ");
        char fill = scanner.next().charAt(0);

        System.out.println();
        squareOfAsterisks(side, fill);
    }

    public static void squareOfAsterisks(int side, char fillCharacter) {
        System.out.println("Square of Characters\n");
        for(int i = 0; i < side; i++) {
            for(int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
