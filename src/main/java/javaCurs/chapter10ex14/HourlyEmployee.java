package javaCurs.chapter10ex14;

public class HourlyEmployee extends Employee {

    private double hours; // hours worked for week
    private double wage; // wage per hour

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double hours, double wage)
    {
        super(firstName, lastName, socialSecurityNumber);

        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        this.hours = hours;
        this.wage = wage;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        this.hours = hours;
    }

    public void setWage(double wage) {
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else // overtime
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%.2f%n%s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
}
