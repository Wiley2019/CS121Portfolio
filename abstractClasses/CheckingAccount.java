package abstractClasses;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountHolder, String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountHolder, accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getAccountDetails() {
        return "Checking Account: " + accountHolder + ", Account Number: " + accountNumber + ", Balance: " + balance + ", Overdraft Limit: " + overdraftLimit;
    }
}
