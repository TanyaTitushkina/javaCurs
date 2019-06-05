package javaCurs.chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class C16ex13_DuplicateElimination {

    public static void main(String[] args) {

        String answer="y";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter several First Names separating them by spaces:");
        String firstNames = scanner.nextLine().toLowerCase();

        String[] firstNamesArr = firstNames.split(" ");
        Collection<String> uniqueFirstNames = new TreeSet(Arrays.asList(firstNamesArr));
        System.out.println("Set of unique names: " + uniqueFirstNames);

        List<String> uniqueFirstNamesList = new ArrayList();
        for(String name : uniqueFirstNames) {
            uniqueFirstNamesList.add(name);
        }
        while(!answer.equals("n")) {
            System.out.println("\nWhat First Name do you want to search?");
            Scanner scanner1 = new Scanner(System.in);
            String searchName = scanner1.nextLine().toLowerCase();

            if(answer.equals("n")) {
                continue;
            }
            if(searchName.matches("([a-zA-Z0])+")) {
                int index = Collections.binarySearch(uniqueFirstNamesList, searchName);
                if(index >= 0) {
                    System.out.println("This First Name was found at index " + index + " with value '" +  uniqueFirstNamesList.get(index) + "'");
                } else {
                    System.out.println("First Name was not found");
                }
            } else {
                System.out.println("First Name must contain alpha characters only");
            }
            System.out.println("\nDo you want to enter another First Name? (y/n)");
            answer = scanner.next();
        }
    }
}
