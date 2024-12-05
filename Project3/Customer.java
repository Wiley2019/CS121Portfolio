package Project3;
import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private ArrayList<Account> accounts;

    public Customer(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to remove an account from the customer
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Get all account details as a string
    public String getAllAccounts() {
        StringBuilder accountInfo = new StringBuilder();
        for (Account account : accounts) {
            accountInfo.append(account.toString()).append("\n");
        }
        return accountInfo.toString();
    }

    // Method to get account by account number
    public Account getAccountByNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; // Return null if account not found
    }

    public String toString() {
        return "Customer: " + firstName + " " + lastName + " | PIN: " + pin;
    }

    public String getPin() {
        return pin;
    }
}