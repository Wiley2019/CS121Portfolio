package abstractClasses;

public class AccountTest {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount("Alice", "SA123", 1000.0, 0.03);
        Account checkingAccount = new CheckingAccount("Bob", "CA456", 500.0, 200.0);

        System.out.println(savingsAccount.getAccountDetails());
        System.out.println(checkingAccount.getAccountDetails());
    }
}
