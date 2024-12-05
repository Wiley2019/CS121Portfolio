package Project3;
public class Account {
    private double balance;
    private int accountNumber;
    private static int numberOfAccounts = 1000; // Static variable for account number tracking

    // Constructor with initial deposit
    public Account(double initialDeposit) {
        this.balance = initialDeposit;
        this.accountNumber = ++numberOfAccounts; // Increment before assigning the account number
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit: $" + amount + " | Updated Balance: $" + this.balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal: $" + amount + " | Updated Balance: $" + this.balance);
        }
    }

    // toString method to return account number and balance
    @Override
    public String toString() {
        return "Account Number: " + this.accountNumber + " | Balance: $" + this.balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }
}
