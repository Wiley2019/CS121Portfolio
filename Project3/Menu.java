package Project3;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Bank bank;

    public Menu() {
        scanner = new Scanner(System.in);
        bank = new Bank();
    }

    // Display the main menu
    public void displayMenu() {
        System.out.println("1. Open a new account");
        System.out.println("2. Access an existing account");
        System.out.println("3. Close all accounts");
        System.out.println("4. Exit");
    }

    // Run the main menu
    public void runMenu() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    openNewAccount();
                    break;
                case 2:
                    accessExistingAccount();
                    break;
                case 3:
                    closeAllAccounts();
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid entry. Please try again.");
            }
        } while (choice != 4);
    }

    private void openNewAccount() {
        System.out.print("Are you a new customer? (yes/no): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            createNewCustomer();
        } else {
            System.out.print("Enter your PIN: ");
            String pin = scanner.nextLine();
            Customer customer = bank.getCustomerByPin(pin);
            if (customer == null) {
                System.out.println("Invalid PIN.");
                return;
            }

            System.out.print("Enter initial deposit for the new account: ");
            double deposit = scanner.nextDouble();
            Account newAccount = new Account(deposit);
            customer.addAccount(newAccount);
            System.out.println("New Account Opened: " + newAccount.toString());
        }
    }

    private void createNewCustomer() {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter a 4-digit PIN: ");
        String pin = scanner.nextLine();

        Customer newCustomer = new Customer(firstName, lastName, pin);
        bank.addCustomer(newCustomer);

        System.out.print("Enter initial deposit for the new account: ");
        double deposit = scanner.nextDouble();
        Account newAccount = new Account(deposit);
        newCustomer.addAccount(newAccount);
        System.out.println("New Account Opened: " + newAccount.toString());
    }

    private void accessExistingAccount() {
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();

        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("Invalid PIN.");
            return;
        }

        System.out.println("Accounts: ");
        System.out.println(customer.getAllAccounts());
        System.out.print("Enter account number to access: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Account account = customer.getAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Invalid account number.");
            return;
        }

        // Provide options to perform actions on the account
        int actionChoice;
        do {
            System.out.println("\nChoose an action:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            actionChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (actionChoice) {
                case 1:
                    depositMoney(account);
                    break;
                case 2:
                    withdrawMoney(account);
                    break;
                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting account.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (actionChoice != 4);
    }

    private void depositMoney(Account account) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdrawMoney(Account account) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    private void closeAllAccounts() {
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();

        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("Invalid PIN.");
            return;
        }

        bank.removeCustomer(customer);
        System.out.println("Customer has been removed from bank registry.");
    }
}
