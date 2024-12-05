package interfaces;

public class TransactionTest {
    public static void main(String[] args) {
        DepositTransaction deposit = new DepositTransaction(1000.0);
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(500.0);

        deposit.processTransaction(200.0);
        System.out.println("Current Balance after deposit: " + deposit.getBalance());

        withdrawal.processTransaction(100.0);
        System.out.println("Current Balance after withdrawal: " + withdrawal.getBalance());
    }
}
