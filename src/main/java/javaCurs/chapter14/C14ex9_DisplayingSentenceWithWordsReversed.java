package javaCurs.chapter14;

import java.util.Scanner;

public class C14ex9_DisplayingSentenceWithWordsReversed {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "y";

        while(!answer.equals("n")) {
            System.out.println("=== Do you want to enter a sentence? ===");
            System.out.println("No: enter 'n'");
            System.out.println("Yes: enter a sentence\n");
            String sentence = scanner.nextLine();
            if("n".equals(sentence)) {
                answer = sentence;
                continue;
            }
            String[] tokens = sentence.split(" ");

            for(int i = tokens.length-1; i >= 0; i--) {
                System.out.print(tokens[i]);
                if(i != 0)
                    System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
