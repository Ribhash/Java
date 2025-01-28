import java.awt.*;
import javax.swing.*;

public class CheckBoxRadioButtonExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Checkbox and RadioButton Example");
        
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create CheckBoxes
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");

        // Create RadioButtons with a ButtonGroup
        JRadioButton radioButton1 = new JRadioButton("Choice A");
        JRadioButton radioButton2 = new JRadioButton("Choice B");
        JRadioButton radioButton3 = new JRadioButton("Choice C");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        radioGroup.add(radioButton3);

        // Add CheckBoxes and RadioButtons to the frame
        frame.add(new JLabel("Select your options:"));
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);

        frame.add(new JLabel("Select one choice:"));
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
