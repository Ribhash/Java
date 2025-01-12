import java.awt.*;
import javax.swing.*;
public class combobox {
String str[]={"Ribhash","Nishesh","Dipesh"};
combobox(){
    JFrame f = new JFrame("Combobox");
    JComboBox bc = new JComboBox(str);
    f.setSize(300,300);
    f.add(bc);
    f.setVisible(true);
    f.setLayout(new FlowLayout());
    
   

}   
public static void main(String[] args) {
    {
        new combobox();
    }
} 
}
