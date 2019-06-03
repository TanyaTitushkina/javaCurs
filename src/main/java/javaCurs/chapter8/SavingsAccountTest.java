package javaCurs.chapter8;

public class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        try {
            SavingsAccount.modifyInterestRate(0.04); // = 4%
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("*** Monthly interest for each of 12 months for both savers ***");
        System.out.println("Annual Interest Rate = 4%\n");
        for(int i = 0; i < 12; i++) {
            System.out.println("Month " + (i+1) + ":\n");
            System.out.printf("saver1 interest rate = $%.2f%n", saver1.calculateMonthlyInterest());
            saver1.setSavingsBalance(saver1.getSavingsBalance() + saver1.calculateMonthlyInterest());

            System.out.printf("saver2 interest rate = $%.2f%n", saver2.calculateMonthlyInterest());
            saver2.setSavingsBalance(saver2.getSavingsBalance() + saver2.calculateMonthlyInterest());
            System.out.println("------------------------------------");
        }

        System.out.println("After 12 months:\n");
        System.out.printf("saver1 Savings Balance = $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("saver2 Savings Balance = $%.2f\n", saver2.getSavingsBalance());

        System.out.println("\n*** New Annual Interest Rate = 5% ***\n");
        SavingsAccount.modifyInterestRate(0.05);

        saver1.setSavingsBalance(saver1.getSavingsBalance() + saver1.calculateMonthlyInterest());
        saver2.setSavingsBalance(saver2.getSavingsBalance() + saver2.calculateMonthlyInterest());

        System.out.println("For next month:\n");
        System.out.printf("saver1 Savings Balance = $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("saver2 Savings Balance = $%.2f\n", saver2.getSavingsBalance());
    }
}
