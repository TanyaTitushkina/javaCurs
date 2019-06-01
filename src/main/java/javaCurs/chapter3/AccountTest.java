package javaCurs.chapter3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Bilbo Baggins", 50.00);
        Account account2 = new Account("Frodo Baggins", -7.53);

        // 3.11 display initial balance of each object
        //System.out.printf("%s balance: $$%.2f%n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $$%.2f%n%n", account2.getName(), account2.getBalance());

        // 3.15 display initial balance of each object
        displayAccount(account1);
        displayAccount(account2);

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1's balance

        // 3.11 display balances
        //System.out.printf("%s balance: $$%.2f%n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $$%.2f%n%n", account2.getName(), account2.getBalance());

        // 3.15 display balances
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("\nEnter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        // 3.11 display balances
        //System.out.printf("%s balance: $$%.2f%n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $$%.2f%n%n", account2.getName(), account2.getBalance());

        // 3.15 display balances
        displayAccount(account1);
        displayAccount(account2);

        //withdraw money from accounts
        System.out.print("\nEnter withdrawal amount for account1: ");
        double amount = input.nextDouble();
        System.out.printf("Withdrawing $%f from account: %s%n", amount, account1.getName());
        account1.withdraw(amount);

        System.out.print("\nEnter withdrawal amount for account2: ");
        amount = input.nextDouble();
        System.out.printf("Withdrawing $%f from account: %s%n", amount, account2.getName());
        account2.withdraw(amount);

        // 3.11 display balances
        //System.out.printf("%s balance: $$%.2f%n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $$%.2f%n%n", account2.getName(), account2.getBalance());

        // 3.15 display balances
        displayAccount(account1);
        displayAccount(account2);

        input.close();
    }

    //3.15 (Removing Duplicated Code in Method main)
    public static void displayAccount(Account account) {
        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());
    }
}
