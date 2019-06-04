package javaCurs.chapter10ex14;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary; // base salary per week

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate,
                                      double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);

        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s %s%n%s: $%.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
