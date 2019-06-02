package javaCurs.chapter4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C4ex20_SalaryCalculator {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Frodo", "Baggins");
        employeeList.add(emp1);
        Employee emp2 = new Employee("Peregrin", "Took");
        employeeList.add(emp2);
        Employee emp3 = new Employee("Meriadoc", "Brandybuck");
        employeeList.add(emp3);

        Scanner scanner = new Scanner(System.in);

        for(Employee emp : employeeList) {
            System.out.print("Enter number of hours worked last week by " + emp.getFirstName() + " " + emp.getLastName() + ": ");
            emp.setWorkedHours(scanner.nextInt());
            System.out.print("Enter hourly rate: ");
            emp.setHourlyRate(scanner.nextInt());
            System.out.println("*********************************************************");
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + " gross pay = " + emp.getGrossPay());
            System.out.println("*********************************************************\n");
        }
    }
}
