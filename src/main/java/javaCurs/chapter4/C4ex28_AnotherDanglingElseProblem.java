package javaCurs.chapter4;

public class C4ex28_AnotherDanglingElseProblem {

    public static void main(String[] args) {

        int x = 5;
        int y = 8;

        System.out.println("x = " + x + " y = " + y);
        System.out.println("a)");

        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");

//		a) The following output is produced:
//		@@@@@
//		$$$$$
//		&&&&&

        System.out.println("b)");
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
//		b) The following output is produced:
//		@@@@@

        System.out.println("c)");
        if (y == 8) {
            if (x == 5)
                System.out.println("@@@@@");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
//		c) The following output is produced:
//		@@@@@

//      b) and c) look similar, but I've tried to put {} in different places

        System.out.println("---------------------------------------");
        y = 7;
        System.out.println("x = " + x + " y = " + y);
        if (y == 8) {
            if (x == 5)
                System.out.println("@@@@@");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
//		d) The following output is produced.
//		#####
//		$$$$$
//		&&&&&
    }
}
