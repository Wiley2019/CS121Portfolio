package HashMap;


public class Main {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account = new BankAccount("John Doe", "ACC123456", "Savings");

        // Add transactions
        account.addTransaction("T1001", "Deposit, $500, 01/01/2024");
        account.addTransaction("T1002", "Withdrawal, $200, 01/02/2024");
        account.addTransaction("T1003", "Deposit, $300, 01/03/2024");

        // Display all transactions
        System.out.println("Initial transaction history:");
        account.displayAllTransactions();

        // Remove one transaction
        account.removeTransaction("T1002");
        System.out.println("\nTransaction history after removal of T1002:");
        account.displayAllTransactions();
    }
}
