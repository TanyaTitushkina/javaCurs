package javaCurs.chapter3;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setMonthlySalary(monthlySalary);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0.00) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return getMonthlySalary() * 12;
    }

    public void raiseMonthlySalary(double percentage) {
        double currentMonthlySalary = getMonthlySalary();
        setMonthlySalary(currentMonthlySalary * (100 + percentage) / 100);
    }
}
