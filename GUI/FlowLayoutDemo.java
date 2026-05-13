import javax.swing.*;
import java.awt.FlowLayout;

public class FlowLayoutDemo {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("FlowLayout Demo");

        // Set FlowLayout
        frame.setLayout(new FlowLayout());

        // Create components
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JLabel label = new JLabel("FlowLayout Example");
        JTextField textField = new JTextField(10);

        // Add components to frame
        frame.add(label);
        frame.add(textField);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}