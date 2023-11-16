package Food_Ordering_System;

import Calculator.Simple_Calculator;

import javax.swing.*;

public class Food_Ordering_System extends JFrame{
    private JPanel panel1;
    private JCheckBox pizzaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JButton orderButton;

    public Food_Ordering_System() {
        Food_Ordering_System a = this;
        boolean isTrue;

        orderButton.addActionListener(e -> {
            float tot = 0;

            if (pizzaCheckBox.isSelected()) {
                tot = tot + 100;
            }
            if (burgerCheckBox.isSelected()) {
                tot = tot + 80;
            }
            if (friesCheckBox.isSelected()) {
                tot = tot + 65;
            }
            if (softDrinksCheckBox.isSelected()) {
                tot = tot + 55;
            }
            if (teaCheckBox.isSelected()) {
                tot = tot + 50;
            }
            if (sundaeCheckBox.isSelected()) {
                tot = tot + 40;
            }


            if(noneRadioButton.isSelected()){
                tot = tot;
            }
            if(a5OffRadioButton.isSelected()){
                tot = (float) (tot - (tot * 0.05));
            }
            if(a10OffRadioButton.isSelected()){
                tot = (float) (tot - (tot * 0.10));
            }
            if(a15OffRadioButton.isSelected()){
                tot = (float) (tot - (tot * 0.15));
            }

            JOptionPane.showMessageDialog(a, "Total price is Php " + String.format("%.2f", tot));
        });
    }


    public static void main(String[] args) {
        Food_Ordering_System app = new Food_Ordering_System();
        app.setContentPane(app.panel1);
        app.setSize(290,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
