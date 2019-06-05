package javaCurs.chapter14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C14ex22_MorseCode {

    final static String morseTable = "A .-|B -...|C -.-.|D -..|E .|F ..-.|G --.|H ....|I ..|J .---" +
            "|K -.-|L .-..|M --|N -.|O ---|P .--.|Q --.-|R .-.|S ...|T -|U ..-|V ...-|W .--|X -..-|Y -.--|Z --.." +
            "|1 .----|2 ..---|3 ...--|4 ....-|5 .....|6 -....|7 --...|8 ---..|9 ----.|0 -----|";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Menu Options:");
        while (true) {
            System.out.println("\n 1 - Enter English-language phrase");
            System.out.println(" 2 - Enter Morse code");
            System.out.println(" 0 - Quit");

            System.out.print("\nChoose the option number: ");
            Scanner inputOption = new Scanner(System.in);
            int optionCode = inputOption.nextInt();

            if (optionCode == 0) {
                break;
            } else if (optionCode == 1) {
                System.out.print("Enter English-language phrase: ");
                String phrase = scanner.nextLine();
                if (phrase.matches("[\\w+\\s*]*")) { //check if input is alphanumeric
                    encodeEngToMorse(phrase);
                } else {
                    System.out.println("Invalid input. English phrase must be Alphanumeric and with Latin letters!");
                    System.out.println("Please, try once again.");
                    continue;
                }
            } else if (optionCode == 2) {
                System.out.print("Enter Morse code: ");
                String phrase = scanner.nextLine();
                if (phrase.matches("[(\\.+\\-*\\s*)|(\\.*\\-+\\s*)]*")) { // check if input is Morse
                    decodeMorseToEng(phrase);
                } else {
                    System.out.println("Invalid input. It is not a Morse code!");
                    System.out.println("Please, try once again.");
                    continue;
                }
            } else {
                System.out.println("\nWrong option number! Please, try once again.");
                continue;
            }
        }
    }

    public static String encodeEngToMorse (String inputText){

        String text = inputText.toUpperCase().replace(" ", "$"); // need to replace

        int i = 0;
        while (i < text.length()) {

            String replacingChr = text.substring(i, i + 1);
            if (!replacingChr.matches("\\w{1}|\\$")) {
                i++;
                continue;
            }
            Pattern expression = Pattern.compile(replacingChr + "{1}\\s(-*\\.*){1,5}");
            Matcher matcher = expression.matcher(morseTable);

            if (matcher.find()) {
                String[] keyValue = matcher.group().split(" ");
                String replaceWith = keyValue[1];
                text = text.replace(replacingChr, replaceWith + " ");
                i = i + replaceWith.length() + 1;
            } else {
                i++;
            }
        }
        System.out.println("Morse code equivalent: " + text.replace("$", "   "));
        return text.replace("$", "   ");
    }

    public static String decodeMorseToEng (String textToDecoded){

        String text = textToDecoded.replace("   ", "$");

        Pattern morseExpression = Pattern.compile("\\s?(-*\\.*){1,5}");
        Matcher matcherMorse = morseExpression.matcher(text);

        while (matcherMorse.find()) {
            String morseLetter = matcherMorse.group();
            Pattern engPlusMorse = Pattern.compile("[A-Z0-9]\\s{1}(" + morseLetter.replace(".", "\\.").trim() + ")(?=\\|)");
            Matcher matcherEngPlusMorse = engPlusMorse.matcher(morseTable);

            if (matcherEngPlusMorse.find()) {
                String[] engPlusMorseLetter = matcherEngPlusMorse.group().split(" "); //split returned value (e.g. 'A .-')
                text = text.replaceFirst(morseLetter, engPlusMorseLetter[0]);
            }
        }
        System.out.println("Morse decoded in English: " + text.toLowerCase().replace("$", "   "));
        return text.replace("$", " ");
    }
}
