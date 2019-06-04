package javaCurs.chapter10ex14;

public class PayrollSystemTest {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Peregrin", "Took", "999-11-1111", 300.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Frodo", "Baggins", "111-11-1111", 42.0, 20.0);
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                        "Sue", "Jones", "222-22-2222", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        PieceWorker pieceWorker = new PieceWorker
                ("John", "Travolta", "999-99-999", 2.25, 2000);

        System.out.println("Employee information obtained by get methods:");

        System.out.printf("%n%s%n%s: $%.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", pieceWorker, "earned", pieceWorker.earnings());

        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.println("Employee information obtained polymorphically:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
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
