import javax.swing.*;

public class nolayout {
    JFrame f;

    nolayout() {
        // Initialize the JFrame
        f = new JFrame("Border Layout");

        // Create a button
        JButton b1 = new JButton("b1");

        // Add the button to the JFrame
        f.add(b1);

        // Set JFrame properties
        f.setSize(300, 200); // Set the frame size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the program exits on close
        f.setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        new nolayout();
    }
}
