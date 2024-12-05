package abstractClasses;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, String accountNumber, double initialBalance, double interestRate) {
        super(accountHolder, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountDetails() {
        return "Savings Account: " + accountHolder + ", Account Number: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate;
    }
}

