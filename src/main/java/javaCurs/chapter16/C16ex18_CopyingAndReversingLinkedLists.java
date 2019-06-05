package javaCurs.chapter16;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class C16ex18_CopyingAndReversingLinkedLists {

    public static void main(String[] args) {

        LinkedList<Character> charList1 = new LinkedList<>();

        for (int i = 0; i < 10; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter character nr." + (i+1) + ": ");
            String input = scanner.nextLine();
            charList1.add(input.charAt(0));
        }

        LinkedList<Character> charList2 = new LinkedList<>();

        ListIterator<Character> iterator1 = charList1.listIterator(charList1.size());
        while(iterator1.hasPrevious()) {
            charList2.add(iterator1.previous());
        }

        System.out.println("\n1st List: " + charList1);
        System.out.println("2nd List: " + charList2);
    }
}
