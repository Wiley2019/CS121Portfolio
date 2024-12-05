package abstractClasses;

public abstract class Account {
    protected String accountHolder;
    protected String accountNumber;
    protected double balance;

    public Account(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Abstract method to get account details
    public abstract String getAccountDetails();
}
