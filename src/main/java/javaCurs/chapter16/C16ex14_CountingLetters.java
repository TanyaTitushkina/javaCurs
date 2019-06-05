package javaCurs.chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class C16ex14_CountingLetters {

    public static void main(String[] args) {
        // create HashMap to store String keys and Integer values
        Map<Character, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    }

    // create map from user input
    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        char[] chars = input.replace(" ", "").toCharArray();

        for (Character chr : chars) {
            if (map.containsKey(chr)) {
                int count = map.get(chr); // get current count
                map.put(chr, count + 1); // increment count
            } else
                map.put(chr, 1); // add new char with a count of 1 to map
        }
    }

    // display map content
    private static void displayMap(Map<Character, Integer> map) {

        Set<Character> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (Character key : sortedKeys)
            System.out.printf("%s\t\t%s%n", key, map.get(key));

        System.out.printf("%nNumber of unique chars = %d%nMap is Empty: %b%n", map.size(), map.isEmpty());
    }
}
