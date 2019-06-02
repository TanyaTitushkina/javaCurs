package javaCurs.chapter4;

public class C4ex27_DanglingElseProblem {

    public static void main(String[] args) {
        System.out.println("x = 9, y = 11");
        int x = 9;
        int y = 11;

        System.out.println("a)");
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        System.out.println("b)");
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("x = 11, y = 9");
        x = 11;
        y = 9;

        System.out.println("a)");
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        System.out.println("b)");
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}
