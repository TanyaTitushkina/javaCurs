package javaCurs.chapter14;

import java.util.Scanner;

public class C14ex7_PigLatin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "y";

        while(!answer.equals("n")) {
            System.out.println("=== Do you want to enter a sentence? ===");
            System.out.println("No: enter 'n'");
            System.out.println("Yes: enter a sentence (without punctuation marks and all words have 2 or more letters)\n");
            String sentence = scanner.nextLine();
            if("n".equals(sentence)) {
                answer = sentence;
                continue;
            }
            String[] tokens = sentence.split(" ");

            for(int i = 0; i < tokens.length; i++) {
                printLatinWord(tokens[i]);
                if(i != tokens.length - 1)
                    System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

    private static void printLatinWord(String token) {
        System.out.print(token.substring(1) + token.substring(0,1) + "ya");
    }
}
