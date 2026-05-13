import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SumDifferenceGUI {

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Sum & Difference");

        // Input fields
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        // Output label
        JLabel result = new JLabel("Result will appear here");

        // Set bounds
        t1.setBounds(50, 50, 200, 30);
        t2.setBounds(50, 100, 200, 30);
        result.setBounds(50, 200, 300, 30);

        // Mouse actions on frame
        frame.addMouseListener(new MouseAdapter() {

            // Mouse press → Sum
            @Override
            public void mousePressed(MouseEvent e) {

                try {

                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());

                    int sum = a + b;

                    result.setText("Sum = " + sum);

                } catch (Exception ex) {

                    result.setText("Enter valid numbers");
                }
            }

            // Mouse release → Difference
            @Override
            public void mouseReleased(MouseEvent e) {

                try {

                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());

                    int diff = a - b;

                    result.setText("Difference = " + diff);

                } catch (Exception ex) {

                    result.setText("Enter valid numbers");
                }
            }
        });

        // Add components
        frame.add(t1);
        frame.add(t2);
        frame.add(result);

        // Frame settings
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}