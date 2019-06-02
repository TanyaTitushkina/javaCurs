package javaCurs.chapter4;

public class Customer {

    private int accountNumber;
    private int startBalance;
    private int totalCharged;
    private int totalCredit;
    private int allowedCredit;

    public Customer() {}

    public Customer(int accountNumber, int startBalance, int totalCharged, int totalCredit, int allowedCredit) {
        super();
        this.accountNumber = accountNumber;
        this.startBalance = startBalance;
        this.totalCharged = totalCharged;
        this.totalCredit = totalCredit;
        this.allowedCredit = allowedCredit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getStartBalance() {
        return startBalance;
    }
    public void setStartBalance(int startBalance) {
        this.startBalance = startBalance;
    }
    public int getTotalCharged() {
        return totalCharged;
    }
    public void setTotalCharged(int totalCharged) {
        this.totalCharged = totalCharged;
    }
    public int getTotalCredit() {
        return totalCredit;
    }
    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }
    public int getAllowedCredit() {
        return allowedCredit;
    }
    public void setAllowedCredit(int allowedCredit) {
        this.allowedCredit = allowedCredit;
    }
    public void newBalance() {
        int newBalance = this.startBalance + this.totalCharged - this.totalCredit;
        System.out.println("**********************************************");
        System.out.println("New balance = " + newBalance);
        if(newBalance < allowedCredit) {
            System.out.println("Credit limit exceeded!");
        }
        System.out.println("**********************************************");
    }
}
