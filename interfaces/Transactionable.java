package interfaces;

public interface Transactionable {
    void processTransaction(double amount);
    double getBalance();
}

