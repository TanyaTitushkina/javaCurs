package javaCurs.chapter8;

public class SavingsAccount {

    private static double annualInterestRate = 0.0;
    private double savingsBalance;

    public SavingsAccount() {
        this.savingsBalance = 0.0;
    }

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double annualRate) {
        if(annualRate < 0.0 || annualRate > 1.0) {
            throw new IllegalArgumentException("The Annual Interest Rate should be between 0.0 and 1.0 (1.0 = 100%)");
        } else annualInterestRate = annualRate;
    }

    public double calculateMonthlyInterest() {
        return this.savingsBalance * annualInterestRate / 12;
    }
}
