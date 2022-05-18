package module1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.spi.CurrencyNameProvider;

public class CurrencyConverter {
    JFrame frame;
    JPanel panel;
    JPanel panel2;
    JButton button;
    JTextField field;
    JTextField field2;

    CurrencyConverter() {
        frame = new JFrame("Currency conversion made easy!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(panel = new JPanel());
        frame.add(panel2 = new JPanel());
        panel.add(button = new JButton("Convert"));
        panel.add(field = new JTextField(15));
        panel2.add(field2 = new JTextField(15));
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = Double.parseDouble(field.getText())*0.16;

                //TODO: Handle conversion other way around
                field2.setText(String.valueOf(result));
                frame.repaint();
                frame.validate();
            }
        });
    }

    void run() {}

    public static void main(String[] args) {
        new CurrencyConverter().run();
    }
}
