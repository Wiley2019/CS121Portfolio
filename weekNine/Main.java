package weekNine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an account for a premium customer
        System.out.print("Enter Customer ID for Premium Account: ");
        String premiumCustomerId = scanner.nextLine();
        BankAccount premiumAccount = new BankAccount(premiumCustomerId);

        // Creating an account for a non-premium customer
        System.out.print("Enter First Name for Account: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name for Account: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Account Type (Checking/Savings): ");
        String accountType = scanner.nextLine();
        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        BankAccount nonPremiumAccount = new BankAccount(firstName, lastName, accountType, initialDeposit);

        // Displaying account information
        System.out.println("\nAccount Info:");
        System.out.println(premiumAccount.displayAccountInfo());
        System.out.println("\nAccount Info:");
        System.out.println(nonPremiumAccount.displayAccountInfo());

        // Calling overloaded methods
        System.out.println("\nAccount Full Info:");
        System.out.println(nonPremiumAccount.displayAccountInfo("full"));

        double interest1 = nonPremiumAccount.calculateInterest(5.0);
        double interest2 = nonPremiumAccount.calculateInterest(5.0, 3); // For 3 years

        System.out.println("Interest on Account (1 year at 5%): $" + interest1);
        System.out.println("Interest on Account (3 years at 5%): $" + interest2);

        scanner.close();
    }
}
