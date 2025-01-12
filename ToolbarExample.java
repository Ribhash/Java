import javax.swing.*;

public class ToolbarExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Toolbar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JToolBar
        JToolBar toolbar = new JToolBar();

        // Create buttons for the toolbar
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        // Add buttons to the toolbar
        toolbar.add(newButton);
        toolbar.add(openButton);
        toolbar.add(saveButton);

        // Add the toolbar to the frame
        frame.add(toolbar, "North");

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
