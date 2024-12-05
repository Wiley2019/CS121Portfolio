package interfaces;

public class WithdrawalTransaction implements Transactionable {
    private double balance;

    public WithdrawalTransaction(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void processTransaction(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
