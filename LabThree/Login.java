package LabThree;

import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {

        String userName;
        String password;

        userName = (JOptionPane.showInputDialog("Please enter your username: "));
        password = (JOptionPane.showInputDialog("Please enter your password: "));

        String name = (JOptionPane.showInputDialog("Welcome to login please enter your username: "));
        String pw = (JOptionPane.showInputDialog("Welcome to login please enter your password: "));

        String message1 = "Welcome to CS1";
        String message2 = "Your username is correct but your password is wrong";
        String message3 = "Your password is correct but your username is wrong";
        String message4 = "Your username and password are both wrong";

        if (name == userName && pw == password) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121.");
        } else if (name == userName || pw == password ) {
            JOptionPane.showMessageDialog(null, "One of the inputs is incorrect.");
        } else {
            JOptionPane.showMessageDialog(null, "Both inputs are incorrect.");
        }
    }
}