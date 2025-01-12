import java.awt.*;
import javax.swing.*;
 class textfield  {
     textfield()
    {
        JFrame f =new JFrame();
        JLabel label = new JLabel("Name");
        JTextField j = new JTextField(20);
        JPasswordField p = new JPasswordField();
        f.add(label);
        f.add(j);
        f.add(p);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);


    }
    public static void main(String[] args)
    {
        new textfield();
    }

    
}
