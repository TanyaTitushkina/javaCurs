package javaCurs.chapter9;

public class HourlyEmployee extends Employee {

    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        if(hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be >= 0 and <= 168");
        }
        if (wage < 0.0)
            throw new IllegalArgumentException("Wage must be >= 0.0");
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if(hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be >= 0 and <= 168");
        }
        this.hours = hours;
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("Wage must be >= 0.0");
        this.wage = wage;
    }

    public double earnings() {
        return hours * wage;
    }

    // returns the HourlyEmployee’s String representation
    @Override
    public String toString() {
        return String.format("%s%s %.1f%n%s %.1f%n%s%.1f", super.toString(), "worked hours:", hours, "wage:",
                wage, "salary: $", earnings());
    }
}
