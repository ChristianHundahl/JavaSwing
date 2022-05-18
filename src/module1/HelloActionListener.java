package module1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HelloActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    HelloActionListener() {
        frame = new JFrame("HelloActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.add(panel = new JPanel());
        panel.add(button = new JButton("Click me!"));
        frame.setVisible(true);
        // Add ActionListener here
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("You clicked me!");
                frame.repaint();
                frame.validate();
            }
        });
        // Then add the ActionListener to the button

    }
    public static void main(String[] args) {
        new HelloActionListener();
    }
}
