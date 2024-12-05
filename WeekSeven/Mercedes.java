package WeekSeven;

public class Mercedes {
    // Instance variables
    private String model;
    private int year;
    private String color;
    private double price;

    // Constructor
    public Mercedes(String model, int year, String color, double price) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    // Method to print car details
    public void printCarDetails() {
        System.out.println("Mercedes - Model: " + model + ", Year: " + year + ", Color: " + color + ", Price: $" + price);
    }

    // Method to calculate depreciation
    public void calculateDepreciation() {
       int currentYear = 2024;
        double depreciation = price * 0.15 * (currentYear - year);
        System.out.println("Depreciation value: $" + depreciation);
    }
}
