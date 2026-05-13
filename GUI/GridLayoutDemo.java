import javax.swing.*;
import java.awt.GridLayout;

public class GridLayoutDemo {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("GridLayout Demo");

        // Set GridLayout (3 rows, 2 columns)
        frame.setLayout(new GridLayout(3, 2));

        // Create components
        frame.add(new JButton("1st grid item"));
        frame.add(new JButton("2nd grid item"));
        frame.add(new JButton("3rd grid item"));
        frame.add(new JButton("4th grid item"));
        frame.add(new JButton("5th grid item"));
        frame.add(new JButton("6th grid item"));

        // Frame settings
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}