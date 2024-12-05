package HashMap;

import java.util.HashMap;

public class BankAccount {
    // Fields
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private HashMap<String, String> transactionHistory;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.transactionHistory = new HashMap<>();
    }

    // Method to add a transaction
    public void addTransaction(String transactionID, String details) {
        transactionHistory.put(transactionID, details);
    }

    // Method to remove a transaction
    public void removeTransaction(String transactionID) {
        transactionHistory.remove(transactionID);
    }

    // Method to get transaction details
    public String getTransaction(String transactionID) {
        return transactionHistory.get(transactionID);
    }

    // Method to display all transactions
    public void displayAllTransactions() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("Transaction History:");
            for (String transactionID : transactionHistory.keySet()) {
                System.out.println("ID: " + transactionID + ", Details: " + transactionHistory.get(transactionID));
            }
        }
    }

    // Getters for account details (optional)
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }
}
