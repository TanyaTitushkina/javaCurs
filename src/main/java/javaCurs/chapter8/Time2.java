package javaCurs.chapter8;

public class Time2 {

    private int secSinceMidnight;

    // Time2 no-argument constructor: initializes each instance variable to zero
    public Time2() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour, minute and second supplied
    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // Time2 constructor: another Time2 object supplied
    public Time2(Time2 time) {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        int minutesAndSeconds = this.secSinceMidnight % 3600;
        this.secSinceMidnight = hour * 3600 + minutesAndSeconds;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        int hours = getHour();
        this.secSinceMidnight = hours * 3600 + minute * 60 + getSecond();
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        this.secSinceMidnight = this.secSinceMidnight - getSecond() + second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        int hour;
        hour = this.secSinceMidnight / 3600;
        return hour;
    }

    // get minute value
    public int getMinute() {
        int minute;
        minute = this.secSinceMidnight % 3600 / 60;
        return minute;
    }

    // get second value
    public int getSecond() {
        int second;
        second = this.secSinceMidnight % 3600 % 60;
        return second;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    //8.7 (Enhancing Class Time2)
    //increments time stored in a Time2 object by 1 second
    public void tick() {
        int second = getSecond();
        if(second == 59) {
            setSecond(0);
            incrementMinute();
        } else setSecond(second + 1);;
    }

    //increments minute by 1
    public void incrementMinute() {
        int minute = getMinute();
        if(minute == 59) {
            setMinute(0);
            incrementHour();
        } else setMinute(minute + 1);
    }

    //increments hour by 1
    public void incrementHour() {
        int hour = getHour();
        if(hour == 23) {
            setHour(0);
        } else setHour(hour + 1);
    }
}
