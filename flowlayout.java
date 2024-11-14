import java.awt.*;
import javax.swing.*;
class flowlayout {
    JFrame f;
    flowlayout()
    {
        f=new JFrame("Flow Layout");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

    }
    public static void main(String[] args)
    {
        new flowlayout();
    }
    
}
