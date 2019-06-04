package javaCurs.chapter10ex12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PayrollSystemTest {

    public static void main(String[] args) {
        // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Peregrin", "Took", "999-11-1111", new Date(6, 23, 1989), 300.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Frodo", "Baggins", "111-11-1111", new Date(9, 9, 1991), 42.0, 20.0);
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                        "Sue", "Jones", "222-22-2222", new Date(10, 25, 1965), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333", new Date(8, 18, 1967), 5000, .04, 300);

        System.out.println("Employee information obtained by get methods:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        //get current month
        LocalDate date = LocalDate.now(); // gets the current date
        DateTimeFormatter formatNumber = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter formatName = DateTimeFormatter.ofPattern("MMMM", Locale.ENGLISH);
        System.out.println("=== Current month is " + date.format(formatNumber) + " (" + date.format(formatName) + ") ===");

        System.out.println("\nEmployee information obtained polymorphically:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }

            //add $100.00 bonus to person's payroll amount, if current month = Employee's birthday month
            if(currentEmployee.getBirthDate().getMonth() == Integer.parseInt(date.format(formatNumber))) {
                System.out.println("\nBIRTHDAY BONUS: + $100 this month!");
                System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings() + 100);
            } else {
                System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
            }
        }

        // get type name of each object in employees array
        for (int i = 0; i < employees.length; i++) {
            String pack = employees[i].getClass().getPackage().toString().substring("package ".length());
            if (employees[i].getClass().getName().contains(pack)) {
                System.out.printf("Employee %d is a %s%n", i,
                        employees[i].getClass().getName().substring((pack + ".").length()));
            } else {
                System.out.printf("Employee %d is a %s%n", i,
                        employees[i].getClass().getName());
            }
        }
    }
}
