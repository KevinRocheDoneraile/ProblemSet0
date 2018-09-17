import javax.swing.*;

public class Problem2 {
    public static void main(String[] args) {
        String firstname, initial, lastname;
        int distance;
        float money;

        firstname = JOptionPane.showInputDialog("Enter your first name");
        lastname = JOptionPane.showInputDialog("Enter your last name");
        initial = JOptionPane.showInputDialog("Enter your initial");
        distance = Integer.parseInt(JOptionPane.showInputDialog("Enter how long you cycle"));

        JOptionPane.showMessageDialog(null,"First name: " + firstname + "\nLast name: " + lastname + "\nInitial: " + initial + "\nDistance: " + distance,"info",JOptionPane.PLAIN_MESSAGE);
    }
}