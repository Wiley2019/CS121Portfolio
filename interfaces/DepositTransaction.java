package interfaces;

public class DepositTransaction implements Transactionable {
    private double balance;

    public DepositTransaction(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void processTransaction(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}


