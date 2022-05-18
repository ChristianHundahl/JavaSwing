package module1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class HelloButton {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    HelloButton() {
        frame = new JFrame("HelloButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.add(panel = new JPanel());
        // Add JButton here
        panel.add(new JButton("Button"));
        frame.setVisible(true);
    }

    void run() {
    }

    public static void main(String[] args) {
        new HelloButton().run();
    }
}