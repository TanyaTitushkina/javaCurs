package javaCurs.chapter8;

public class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year) {

        //check if year in range
        if(year < 0) {
            throw new IllegalArgumentException("year (" + year + ") must be greater than 0");
        }

        // check if month in range
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        // check if day in range for month
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    //increments day by 1
    public void nextDay() {
        if(this.day == daysPerMonth[this.month] && !(this.month == 2)) {
            if(this.month == 12) {
                this.month = 1;
                this.year++;
                this.day = 1;
            } else {
                this.month++;
                this.day = 1;
            }
        } // check for 2nd month and not leap year
        else if (this.day == 28 && this.month == 2 && !(this.year % 400 == 0 ||
                (this.year % 4 == 0 && this.year % 100 != 0))) {
            this.month++;
            this.day = 1;
        } // check for 2nd month and leap year
        else if (this.day == 29 && this.month == 2 && (this.year % 400 == 0 ||
                (this.year % 4 == 0 && this.year % 100 != 0))) {
            this.month++;
            this.day = 1;
        } else this.day++;
    }
}
