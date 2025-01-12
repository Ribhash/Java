import javax.swing.*;

public class SimpleGroupLayout {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Simple GroupLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a JPanel with GroupLayout
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // Create components
        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        // Automatically create gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Set horizontal grouping
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(label)
                .addComponent(textField)
                .addComponent(button)
        );

        // Set vertical grouping
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(label)
                .addComponent(textField)
                .addComponent(button)
        );

        // Add panel to the frame and make it visible
        frame.add(panel);
        frame.setVisible(true);
    }
}

