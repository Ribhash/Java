import javax.swing.*;
public class SetBoundsTest {
   public static void main(String arg[]) {
      JFrame frame = new JFrame("SetBounds Method Test");
      frame.setSize(375, 250);
      // Setting layout as null
      frame.setLayout(null);
      // Creating Button
      JButton button = new JButton("Hello Java");
      // Setting position and size of a button
      button.setBounds(200,30,500,40);
      frame.add(button);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}