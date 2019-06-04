package javaCurs.chapter8;

public class DateTest {

    public static void main(String[] args) {
        Date date1 = new Date(2, 28, 2019);
        System.out.println("\nmonth/day/year");
        String monthName = "new";

        for (int i = 0; i <= 366; i++) {
            date1.nextDay();
            if (monthName.equals("new") && date1.toString().startsWith("3")){
                System.out.println("\nMarch\n");
                monthName = "old";
            }
            if (monthName.equals("old") && date1.toString().startsWith("4")){
                System.out.println("\nApril\n");
                monthName = "new";
            }
            if (monthName.equals("new") && date1.toString().startsWith("5")){
                System.out.println("\nMay\n");
                monthName = "old";
            }
            if (monthName.equals("old") && date1.toString().startsWith("6")){
                System.out.println("\nJune\n");
                monthName = "new";
            }
            if (monthName.equals("new") && date1.toString().startsWith("7")){
                System.out.println("\nJuly\n");
                monthName = "old";
            }
            if (monthName.equals("old") && date1.toString().startsWith("8")){
                System.out.println("\nAugust\n");
                monthName = "new";
            }
            if (monthName.equals("new") && date1.toString().startsWith("9")){
                System.out.println("\nSeptember\n");
                monthName = "old";
            }
            if (monthName.equals("old") && date1.toString().startsWith("10")){
                System.out.println("\nOctober\n");
                monthName = "new";
            }
            if (monthName.equals("new") && date1.toString().startsWith("11")){
                System.out.println("\nNovember\n");
                monthName = "old";
            }
            if (monthName.equals("old") && date1.toString().startsWith("12")){
                System.out.println("\nDecember\n");
                monthName = "new";
            }
            if (monthName.equals("new") && date1.toString().startsWith("1/1/")){
                System.out.println("\nJanuary\n");
                monthName = "old";
            }
            if (monthName.equals("old") && date1.toString().startsWith("2")){
                System.out.println("\nFebruary\n");
                monthName = "new";
            }
            System.out.println(date1.toString());
            // for i = 0, nextDay() must show 3/1/2019, because 2019 is not leap year
            // when is leap year 2020 - method nextDay() must show 2/29/2020 for the last day of February
        }
    }
}
