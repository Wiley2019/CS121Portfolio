package WeekSeven;

public class TestCars {
    public static void main(String[] args) {
        // Instantiate Mercedes
        WeekSeven.Mercedes mercedes = new WeekSeven.Mercedes("S-Class", 2021, "Black", 95000.00);
        mercedes.printCarDetails();
        mercedes.calculateDepreciation();

        // Instantiate Bentley
        WeekSeven.Bentley bentley = new WeekSeven.Bentley("Bentayga", "V8", true, 3);
        bentley.printCarDetails();
        bentley.describeLuxury();
    }
}
