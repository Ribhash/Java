import javax.swing.*;

public class InternalFrameExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Internal Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Create a JDesktopPane (required for managing internal frames)
        JDesktopPane desktopPane = new JDesktopPane();

        // Create a JInternalFrame
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setVisible(true); // Make the internal frame visible

        // Add the internal frame to the desktop pane
        desktopPane.add(internalFrame);

        // Add the desktop pane to the frame
        frame.add(desktopPane);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
