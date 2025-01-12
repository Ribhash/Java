import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ActionListenerExample implements ActionListener {
    JTextField t; // Default (package-private) access

    ActionListenerExample() {
        JFrame f = new JFrame("ActionListener Example");
        f.setLayout(null); // Disable layout manager

        t = new JTextField(20);
        t.setBounds(50, 50, 200, 30); // Set proper bounds for the text field

        JButton btn = new JButton("Show");
        btn.setBounds(50, 100, 100, 30); // Set bounds for the button
        btn.addActionListener(this);

        f.add(t);
        f.add(btn);

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.setText("Hello");
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }
}
