package module1;
import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world!");//Creates the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Allows close on click red cross
        frame.setLayout(new FlowLayout());
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setBackground(Color.getHSBColor(2,5,156));
        panel2.setBackground(Color.red);

        JMenu menu1 = new JMenu("Menu 1");

        JMenuItem menuItem = new JMenuItem("Exit");
        JMenuItem menuItem2 = new JMenuItem("Close");
        JMenuItem menuItem3 = new JMenuItem("Shutdown");
        menu1.add(menuItem);
        menu1.add(menuItem2);
        menu1.add(menuItem3);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu1);

        frame.add(menuBar);

        JLabel labelA = new JLabel("This is also a label");
        JLabel labelB = new JLabel("This is another label");

        JLabel label1 = new JLabel("Now with label!");
        JLabel label2 = new JLabel("More labels!");

        frame.add(panel1);
        frame.add(panel2);

        panel1.add(label1);
        panel1.add(label2);

        panel2.add(labelA);
        panel2.add(labelB);

        frame.setLocationRelativeTo(null);//Centers frame on screen
        frame.pack();//Packs window so components fit -> set after label added
        frame.setVisible(true);//Sets the window to visible - false is default

        new HelloWorldNotRefactored().run();

    }

}
