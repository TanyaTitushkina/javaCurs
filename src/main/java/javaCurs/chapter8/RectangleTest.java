package javaCurs.chapter8;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] arg) {

        Rectangle rec1 = new Rectangle(); // using default constructor

        System.out.println("Rectangle nr.1 perimeter = " + rec1.perimeter());
        System.out.println("Rectangle nr.1 area = " + rec1.area() + "\n");

        Rectangle rec2 = new Rectangle(9, 2);
        System.out.println("Rectangle nr.2 perimeter = " + rec2.perimeter());
        System.out.println("Rectangle nr.2 area = " + rec2.area() + "\n");

        //setting another Length and Width to Rectangle nr.1 by User's input
        String answer = "y";
        Scanner scanner = new Scanner(System.in);

        while(!answer.equals("n")) {
            try {
                System.out.print("Enter Rectangle nr.1 Length: ");
                rec1.setLength(scanner.nextDouble());

                System.out.print("Enter Rectangle nr.1 Width: ");
                rec1.setWidth(scanner.nextDouble());
            } catch (IllegalArgumentException e) {
                System.out.println("\n" + e.getMessage() + "\n");
                continue;
            }
            System.out.println("\nRectangle nr.1 perimeter = " + rec1.perimeter());
            System.out.println("Rectangle nr.1 area = " + rec1.area() + "\n");

            System.out.println("Do you want to set another Length and Width for Rectangle nr.1? (y/n)");
            answer = scanner.next();
        }
    }
}
