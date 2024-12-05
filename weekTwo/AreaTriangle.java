package weekTwo;

import javax.swing.JOptionPane;

public class AreaTriangle {
    public static void main(String[] args) {


        Double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter the height of triangle: "));

        Double base = Double.parseDouble(JOptionPane.showInputDialog("Please enter the base of triangle: "));

        Double area = (base * height) / 2;

        String message = String.format("The area of your triangle is: %.3f", area);
        JOptionPane.showMessageDialog(null, message);
    }
}
