import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class lab1 extends JFrame{
    
    JTextField num1Field,num2Field;
    JLabel outputLabel;
    public lab1(){
        setTitle("Lab 1");
setSize(300, 200);

setLayout(new GridLayout(3, 2));
JLabel num1Label = new JLabel("Number 1:");
num1Field = new JTextField();
JLabel num2Label = new JLabel("Number 2:");
num2Field = new JTextField();
outputLabel = new JLabel();
add(num1Label);
add(num1Field);
add(num2Label);
add(num2Field);
add(outputLabel);

num1Field.addMouseListener(new handleSumDiff());
num2Field.addMouseListener(new handleSumDiff());

setVisible(true);
}

class handleSumDiff extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double sum = num1 + num2;
        outputLabel.setText("Sum: " + sum);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double difference = num1 - num2;
        outputLabel.setText("Difference: " + difference);
    }
}

public static void main(String[] args) {
    new lab1();
}

    }
