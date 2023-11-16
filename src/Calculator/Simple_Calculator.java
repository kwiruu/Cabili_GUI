package Calculator;

import LeapYearChecker.Leap_Year;

import javax.swing.*;

public class Simple_Calculator extends JFrame {
    private JPanel panel1;
    private JTextField input1;
    private JTextField input2;
    private JButton button1;
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JTextPane resultPane;


    public Simple_Calculator(){
        Simple_Calculator a = this;
        boolean isTrue;

        button1.addActionListener(e -> {
            String input1Text = input1.getText();
            String input2Text = input2.getText();

            int input_1 = Integer.parseInt(input1Text);
            int input_2 = Integer.parseInt(input2Text);
            int tot=0;

            if(comboBox1.getSelectedIndex()==0) {
                tot = input_1+input_2;
            }
            else if(comboBox1.getSelectedIndex()==1) {
                tot = input_2-input_1;
            }
            else if(comboBox1.getSelectedIndex()==2) {
                tot = input_1*input_2;
            }
            else if(comboBox1.getSelectedIndex()==2) {
                tot = input_1/input_2;
            }

            textArea1.append(String.valueOf(tot+ "\n"));
        });

    }

    public static void main(String[] args) {
        Simple_Calculator app = new Simple_Calculator();

        app.setContentPane(app.panel1);
        app.setSize(350,150);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
};
