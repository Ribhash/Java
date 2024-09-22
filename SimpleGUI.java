import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500
        );

        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        JButton button = new JButton("Click Me!");
       
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

       
        frame.getContentPane().add(label, "North");
        frame.getContentPane().add(button, "South");

       
        frame.setVisible(true);
    }
}

