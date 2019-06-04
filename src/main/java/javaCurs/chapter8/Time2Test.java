package javaCurs.chapter8;

public class Time2Test {

    public static void main(String[] args) {
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21, 34); // 21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        // attempt to initialize t6 with invalid values
        try {
            Time2 t6 = new Time2(27, 74, 99); // invalid values
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }

        //8.7 (Enhancing Class Time2) testing methods
        System.out.println("\n=== 8.7 (Enhancing Class Time2) ===");
        Time2 t7 = new Time2(23, 59, 59);
        t7.tick();
        displayTime("\nt7: 23:59:59\nincrease seconds by 1", t7);

        Time2 t8 = new Time2(23, 59, 59);
        t8.incrementMinute();
        displayTime("\nt8: 23:59:59\nincrease minutes by 1", t8);

        Time2 t9 = new Time2(23, 59, 59);
        t9.incrementHour();
        displayTime("\nt9: 23:59:59\nincrease hours by 1", t9);

        Time2 t10 = new Time2(13, 20, 55);
        t10.tick();
        t10.incrementMinute();
        t10.incrementHour();

        displayTime("\nt10: 13:20:55\nincrease seconds, minutes and hours by 1", t10);
    }

    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n    %s%n    %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
