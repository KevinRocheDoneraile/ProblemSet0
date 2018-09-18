import javax.swing.*;

public class Problem3 {
    public static void main(String[] args) {
        String name;
        int income;

        name = JOptionPane.showInputDialog("Please enter your name?");
        income = Integer.parseInt(JOptionPane.showInputDialog("Please enter your income?"));

        if (income < 10000){
            JOptionPane.showMessageDialog(null, "income: " + income + "\nTax Rate: 20%" +
                    "\nTax" + (income/10*100));
        }
        System.exit(0);
    }
}
