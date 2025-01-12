import javax.swing.*;

public class FileChooserExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("File Chooser Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Add the file chooser to the frame
        frame.add(fileChooser);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
