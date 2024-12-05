package weekTwo;
import javax.swing.JOptionPane;

public class wordGame {

    public static void main(String[] args) {
        String name;
        //JOoption pane
        name = JOptionPane.showInputDialog("Please enter your name: ");
        int age;
        //age
        //age = JOptionPane.showInputDialog("Please enter you age: ");

        //Location
        String location;
        location = JOptionPane.showInputDialog("Pleas enter where you are from: ");

        //school
        String school;
        school = JOptionPane.showInputDialog("Please enter the school or university that you go to: ");

        //animal
        String animal;
        animal = JOptionPane.showInputDialog("Please enter an animal of your choice: ");

        //noun
        String noun = JOptionPane.showInputDialog("please enter a noun that holds things");




        String message = String.format( " %s is from %s, they are at %s. %s has a pet %s. this pet is very dangerous so they have to keep it in a very big %s ", name,location,school,name,animal,noun);
        JOptionPane.showMessageDialog( null,message);

    }
}
