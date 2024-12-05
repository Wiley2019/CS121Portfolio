package WeekSeven;

public class Bentley {
    // Instance variables
    private String model;
    private String engineType;
    private boolean isLuxury;
    private int warrantyYears;

    // Constructor
    public Bentley(String model, String engineType, boolean isLuxury, int warrantyYears) {
        this.model = model;
        this.engineType = engineType;
        this.isLuxury = isLuxury;
        this.warrantyYears = warrantyYears;
    }

    // Method to print car details
    public void printCarDetails() {
        System.out.println("Bentley - Model: " + model + ", Engine Type: " + engineType + ", Is Luxury: " + isLuxury + ", Warranty: " + warrantyYears + " years");
    }

    // Method to describe luxury status
    public void describeLuxury() {
        String luxuryStatus = isLuxury ? "This is a luxury vehicle." : "This is not a luxury vehicle.";
        System.out.println(luxuryStatus);
    }
}
