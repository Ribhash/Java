import java.awt.*;
import javax.swing.*;
 class textfield extends JFrame {
    public textfield()
    {
        JTextField j = new JTextField(20);
        add(j);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);


    }
    public static void main(String[] args)
    {
        new textfield();
    }

    
}
