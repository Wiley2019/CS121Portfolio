package weekNine;

import java.util.Random;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String accountType; // "Checking" or "Savings"
    private double initialDeposit;
    private String customerId;
    private String accountConfirmationNumber;

    // Constructor for premium customers (1 parameter)
    public BankAccount(String customerId) {
        this.customerId = customerId;
        this.accountConfirmationNumber = generateAccountNumber();
    }

    // Constructor for non-premium customers (4 parameters)
    public BankAccount(String firstName, String lastName, String accountType, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountType = accountType;
        this.initialDeposit = initialDeposit;
        this.accountConfirmationNumber = generateAccountNumber();
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getAccountConfirmationNumber() {
        return accountConfirmationNumber;
    }

    // Overloaded methods
    public String displayAccountInfo() {
        return "Account Confirmation Number: " + accountConfirmationNumber +
                ", Name: " + firstName + " " + lastName +
                ", Account Type: " + accountType +
                ", Initial Deposit: $" + initialDeposit;
    }

    public String displayAccountInfo(String format) {
        return format.equalsIgnoreCase("short") ?
                firstName + " " + lastName + " (" + accountType + ")" :
                displayAccountInfo();
    }

    public double calculateInterest(double interestRate) {
        return initialDeposit * interestRate / 100;
    }

    public double calculateInterest(double interestRate, int years) {
        return initialDeposit * Math.pow(1 + (interestRate / 100), years) - initialDeposit;
    }

    private String generateAccountNumber() {
        Random rand = new Random();
        return "AC" + rand.nextInt(100000);
    }
}
