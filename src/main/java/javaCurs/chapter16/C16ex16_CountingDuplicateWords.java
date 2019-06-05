package javaCurs.chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class C16ex16_CountingDuplicateWords {

    public static void main(String[] args) {
        // create HashMap to store String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    }

    // create map from user input
    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        // tokenize the input
        String[] tokens = input.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        // processing input text
        for (String token : tokens) {
            String word = token.toLowerCase(); // get lowercase word

            // if the map contains the word
            if (map.containsKey(word)) {
                int count = map.get(word); // get current count
                map.put(word, count + 1); // increment count
            } else
                map.put(word, 1); // add new word with a count of 1 to map
        }
    }

    // display map content
    private static void displayMap(Map<String, Integer> map) {

        Set<String> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        // generate output for each key in map
        boolean isUnique = true;
        boolean isHeaderPrinted = false;
        for (String key : sortedKeys) {
            if(map.get(key) > 1) {
                if(!isHeaderPrinted) {
                    System.out.printf("%nDuplicate words\t\tNumber%n");
                    isHeaderPrinted = true;
                }
                System.out.printf("%15s\t\t%s%n", key, map.get(key));
                isUnique = false;
            }
        }
        if(isUnique) {
            System.out.println("There are no duplicates in this sentence");
        }
    }
}
