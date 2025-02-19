import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Demo");
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cst = new GridBagConstraints();

        // Add button 1 to the panel
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 0;
        panel.add(btn1, cst);

        // Add button 2 to the panel
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 1;
        cst.gridy = 0;
        panel.add(btn2, cst);

        // Add button 3 to the panel
        cst.gridx = 2;
        cst.gridy = 0;
        panel.add(btn3, cst);

        // Add button 4 to the panel
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridwidth =3;
        cst.gridx = 0;
        cst.gridy = 1;
        panel.add(btn4, cst);

        // Add button 5 to the panel
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 2;
        cst.gridwidth = 1;
        cst.gridy = 2; // Third row
        panel.add(btn5, cst);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
