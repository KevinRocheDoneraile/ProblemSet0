//Problem1.java
/*This program has a simple calculation and displays the info in a dialog box*/

import javax.swing.*;

public class Problem1 {
    public static void main(String[] args) {
        String name, classname;
        int snacks;
        float total2;

        name = JOptionPane.showInputDialog("Enter your name?");
        classname = JOptionPane.showInputDialog("Enter your class");
        snacks = Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like?"));

        total2 = total(snacks);

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nClass: " + classname + "\nNumber of snacks:  " + snacks + "\nCost of snacks: €" + total2, "Info", JOptionPane.PLAIN_MESSAGE);

    }

    public static float total(int a) {
        float cost;
        cost =a *2;
        return cost;
    }
}
