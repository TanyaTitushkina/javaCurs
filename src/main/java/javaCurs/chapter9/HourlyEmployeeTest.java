package javaCurs.chapter9;

public class HourlyEmployeeTest {

    public static void main(String[] args) {
        // instantiate HourlyEmployee object
        HourlyEmployee employee = new HourlyEmployee(
                "Frodo", "Baggins", "111-11-1111", 42.0, 20.0);

        // get hourly employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.1f%n", "Worked hours are", employee.getHours());
        System.out.printf("%s %.2f%n", "Wage per hour is", employee.getWage());
        System.out.printf("%s %s%.2f%n", "Salary for worked hours is", "$", employee.earnings());

        employee.setHours(8.0);
        employee.setWage(10.0);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString", employee);

    }
}
