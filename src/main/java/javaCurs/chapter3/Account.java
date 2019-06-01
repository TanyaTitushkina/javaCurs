package javaCurs.chapter3;

import java.util.Scanner;

public class Account {

    private String name; // instance variable
    private double balance; // instance variable

    // Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
    }

    // method returns the account balance
    public double getBalance() {
        return balance;
    }

    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }

    // method that returns the name
    public String getName() {
        return name;
    }

    //Withdraw a valid amount of money from balance
    public void withdraw(double amount) {
        if(amount <= 0.0) {
            System.out.println("\nYou have entered an invalid withdrawal amount!\nWithdrawal amount must not be equal to 0.\nPlease, try once again.\n");
            System.out.print("Enter withdrawal amount: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextDouble();
            withdraw (amount);
        } else {
            if(amount <= balance) {
                System.out.println("withdraw amount = " + amount + "\n");
                balance = balance - amount;
            } else {
                System.out.println("\nWithdrawal amount exceeded account balance = $" + balance);
                System.out.println("Do you want to withdraw an amount? (y/n)\n");
                Scanner inputAnswer = new Scanner(System.in);
                String answer = inputAnswer.next();
                if(answer.equals("y")){
                    System.out.print("Enter withdrawal amount: ");
                    Scanner input = new Scanner(System.in);
                    amount = input.nextDouble();
                    withdraw (amount);
                }
            }
        }
    }
}
