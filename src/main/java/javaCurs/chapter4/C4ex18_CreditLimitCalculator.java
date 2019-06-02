package javaCurs.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C4ex18_CreditLimitCalculator {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer();
        customerList.add(customer1);
        Customer customer2 = new Customer();
        customerList.add(customer2);
        Customer customer3 = new Customer();
        customerList.add(customer3);

        Scanner scanner = new Scanner(System.in);
        for(Customer customer : customerList) {
            System.out.print("Enter customer number: ");
            customer.setAccountNumber(scanner.nextInt());
            System.out.print("Enter customer balance at the beginning of the month: ");
            customer.setStartBalance(scanner.nextInt());
            System.out.print("Enter total of all items charged by the customer this month: ");
            customer.setTotalCharged(scanner.nextInt());
            System.out.print("Enter total of all credits applied to the customer’s account this month: ");
            customer.setTotalCredit(scanner.nextInt());
            System.out.print("Enter customer allowed credit limit: ");
            customer.setAllowedCredit(scanner.nextInt());

            customer.newBalance();
        }
    }
}
