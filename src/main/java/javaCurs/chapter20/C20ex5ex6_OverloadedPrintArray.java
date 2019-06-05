package javaCurs.chapter20;

import java.util.Arrays;
import java.util.List;

public class C20ex5ex6_OverloadedPrintArray {

    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] strArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"}; //20.6

        //test original printArray
        System.out.printf("Array integerArray contains:%n");
        printArray(intArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(charArray); // pass a Character array

        //test overloaded printArray
        System.out.printf("%nArray integerArray from 1 to 4:%n");
        System.out.println("Number of printed elements = " + printArray(intArray, 1, 4)); // pass an Integer array

        System.out.printf("%nArray doubleArray from 5 to 6:%n");
        System.out.println("Number of printed elements = " + printArray(doubleArray, 5, 6)); // pass a Double array

        System.out.printf("%nArray characterArray from 2 to 4:%n");
        System.out.println("Number of printed elements = " + printArray(charArray, 2, charArray.length-1)); // pass a Character array

        //invalid highSubscript input for Integer array
        System.out.printf("%nArray integerArray from '2' to 'intArray.length + 1' :%n");
        try {
            printArray(intArray, 2, intArray.length + 1); // pass an Integer array
        } catch (InvalidSubscriptionException e) {
            System.out.println(e);
        }

        //invalid lowSubscript input for Double array
        System.out.printf("%nArray doubleArray from '-1' to 'doubleArray.length' :%n");
        try {
            printArray(doubleArray, -1, doubleArray.length); // pass an Double array
        } catch (InvalidSubscriptionException e) {
            System.out.println(e);
        }

        //20.6 - test overloaded nongeneric printArray
        System.out.printf("%nArray stringArray contains:%n");
        printArray(strArray); // pass a String array
    }
    // generic method printArray
    public static <T> void printArray(T[] inputArray) {
        // display array elements
        for (T element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }
    // generic method printArray which prints elements starting from lowSubscript to highSubscript, highSubscript is not included
    public static <T> int printArray(T[] inputArray, int lowSubscript, int highSubscript) {

        //validate lowSubscript and highSubscript
        if(lowSubscript < 0 || lowSubscript > inputArray.length) {
            throw new InvalidSubscriptionException("lowSubscript is invalid");
        } else if (highSubscript < 0 || highSubscript > inputArray.length) {
            throw new InvalidSubscriptionException("highSubscript is invalid");
        }

        // display array elements
        int count = 0;
        for (int i = lowSubscript; i < highSubscript; i++) {
            System.out.printf("%s ", inputArray[i]);
            count++;
        }
        System.out.println();
        return count;
    }
    //20.6 - display String array elements in tabular format
    public static void printArray(String[] strArray) {

        List<String> strList = Arrays.asList(strArray);
        for (int i = 0; i < strList.size(); i++) {
            System.out.printf("%4s%3s",
                    strList.get(i),
                    ((i + 1) % 4 == 0) ? "\n" : " ");
        }
        System.out.println();
    }
}
