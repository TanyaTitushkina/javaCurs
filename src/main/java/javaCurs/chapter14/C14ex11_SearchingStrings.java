package javaCurs.chapter14;

import java.util.Scanner;

public class C14ex11_SearchingStrings {

    public static void main(String[] args) {

        String answer = "y";

        while(!answer.equals("n")) {
            System.out.print("Enter some text: ");
            Scanner scanner = new Scanner(System.in);
            String textLine = scanner.nextLine();
            while(!answer.equals("n")) {
                System.out.print("Enter search character: ");
                char chr = scanner.next().charAt(0);

                int countChr = 0;
                //while char is present in text
                while (textLine.indexOf(chr) != -1) {
                    textLine = textLine.substring(textLine.indexOf(chr) + 1);
                    countChr++;
                }
                System.out.println("\n'" + chr + "' has appeared in text " + countChr + " time(s)");
                System.out.println("\nDo you want to choose another search character? (y/n)");
                answer = scanner.next();
            }
            System.out.println("\nDo you want to enter another text? (y/n)");
            answer = scanner.next();
        }
    }
}
