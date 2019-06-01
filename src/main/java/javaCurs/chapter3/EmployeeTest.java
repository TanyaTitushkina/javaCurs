package javaCurs.chapter3;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Frodo", "Baggins", 800);
        Employee emp2 = new Employee("Peregrin", "Took", 500);

        System.out.println("Yearly salary of employee " + emp1.getFirstName() + " " + emp1.getLastName() + " = $" + emp1.getYearlySalary());
        System.out.println("Yearly salary of employee " + emp2.getFirstName() + " " + emp2.getLastName() + " = $" + emp2.getYearlySalary());

        emp1.raiseMonthlySalary(10);
        emp2.raiseMonthlySalary(10);

        System.out.println("\nRaised yearly salary of employee " + emp1.getFirstName() + " " + emp1.getLastName() + " = $" + emp1.getYearlySalary());
        System.out.println("Raised yearly salary of employee " + emp2.getFirstName() + " " + emp2.getLastName() + " = $" + emp2.getYearlySalary());
    }
}
