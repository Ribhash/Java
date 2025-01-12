import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class treeexample {
 treeexample()
 {
    JFrame f = new JFrame();
    DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
    DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
    DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
    style.add(color);
    style.add(font);
    DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
    DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");

    color.add(red);
    color.add(black);
    JTree tf = new JTree(style);
    f.setVisible(true);
    f.setSize(300,300);
    f.add(tf);


 }   
 public static void main (String[] args)
 {
    new treeexample();
 }
}
