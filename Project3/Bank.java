package Project3;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    // Add a new customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Remove a customer from the bank
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    // Get a customer by PIN
    public Customer getCustomerByPin(String pin) {
        for (Customer customer : customers) {
            if (customer.getPin().equals(pin)) {
                return customer;
            }
        }
        return null; // Return null if customer not found
    }

    // Get all customer info
    public String getAllCustomers() {
        StringBuilder customerInfo = new StringBuilder();
        for (Customer customer : customers) {
            customerInfo.append(customer.toString()).append("\n");
        }
        return customerInfo.toString();
    }
}
