import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldButtonGUI {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Hello World GUI");

        // Create text field
        JTextField textField = new JTextField();

        textField.setBounds(50, 50, 200, 30);

        // Create button
        JButton button = new JButton("Click Me");

        button.setBounds(50, 100, 200, 30);

        // Button action
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText("Hello World");
            }
        });

        // Add components to frame
        frame.add(textField);
        frame.add(button);

        // Frame settings
        frame.setSize(320, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );
        frame.setVisible(true);
    }
}