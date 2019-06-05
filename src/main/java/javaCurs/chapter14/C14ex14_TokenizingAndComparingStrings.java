package javaCurs.chapter14;

import java.util.Scanner;

public class C14ex14_TokenizingAndComparingStrings {

    public static void main(String[] args) {

        String answer = "y";

        while(!answer.equals("n")) {
            System.out.print("Enter some text: ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();

            String[] tokens = text.split(" ");
            System.out.println("\nWords with 'ED' at the end:\n");
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i].toUpperCase().endsWith("ED")) {
                    System.out.println(tokens[i]);
                }
            }
            System.out.println("\nDo you want to enter another text? (y/n)");
            answer = scanner.next();
        }
    }
}
