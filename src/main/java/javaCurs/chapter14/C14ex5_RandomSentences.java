package javaCurs.chapter14;

import java.security.SecureRandom;

public class C14ex5_RandomSentences {

    public static void main(String[] args) {

        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        SecureRandom random = new SecureRandom();
        StringBuilder sentence = new StringBuilder();

        for(int i = 0; i < 20; i++) {
            System.out.print((i+1) + ") ");
            // the final sentence should start with a capital letter
            if(i==19) {
                String firstWord = article[random.nextInt(article.length)];
                sentence.append(firstWord.substring(0, 1).toUpperCase())
                        .append(firstWord.substring(1))
                        .append(" ");
            } else {
                sentence.append(article[random.nextInt(article.length)]).append(" ");
            }

            sentence.append(noun[random.nextInt(noun.length)]).append(" ");
            sentence.append(verb[random.nextInt(verb.length)]).append(" ");
            sentence.append(preposition[random.nextInt(preposition.length)]).append(" ");
            sentence.append(article[random.nextInt(article.length)]).append(" ");

            // the final sentence should end with a period
            if(i==19) {
                sentence.append(noun[random.nextInt(noun.length)]).append(".");
            } else {
                sentence.append(noun[random.nextInt(noun.length)]);
            }
            System.out.println(sentence);
            sentence.delete(0, sentence.length());
        }
    }
}
