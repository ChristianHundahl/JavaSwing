package module1;

import javax.swing.*;

public class HelloWorldNotRefactored {
    private JFrame frame;
    private JLabel label;



    public HelloWorldNotRefactored() {
        frame = new JFrame("HelloWorldNotRefactored");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label = new JLabel("The label"));
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        label.setText("new text");
    }

}
