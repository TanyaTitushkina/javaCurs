package javaCurs.chapter4;

public class Employee {

    private String firstName;
    private String lastName;
    private int workedHours;
    private int hourlyRate;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
    public int getWorkedHours() {
        return workedHours;
    }
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }
    public double getGrossPay() {
        double rate = hourlyRate;
        double hours = workedHours;

        if(hours >= 40) {
            double extraHours = hours - 40;
            return 40 * rate + extraHours * (rate * 1.5);
        } else {
            return hours * rate;
        }
    }
}
