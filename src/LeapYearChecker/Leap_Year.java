package LeapYearChecker;

import javax.swing.*;

public class Leap_Year extends JFrame{
    private JPanel Leap_year_GUI;
    private JTextField yearTextField;
    private JButton button1;

    public Leap_Year(){
        Leap_Year a = this;
        boolean isTrue;

        button1.addActionListener(e -> {
            String yearText = yearTextField.getText();
            int year = Integer.parseInt(yearText);

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                JOptionPane.showMessageDialog(a, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(a, "Not a Leap Year");
            }
        });

    }

    public static void main(String[] args) {
        Leap_Year app = new Leap_Year();

        app.setContentPane(app.Leap_year_GUI);
        app.setSize(300,150);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
