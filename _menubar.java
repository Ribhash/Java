import javax.swing.*;
public class _menubar {

    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;
    _menubar()
    {
        JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Submenu");
        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        i4 = new JMenuItem("Item4");
        i5 = new JMenuItem("Item5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setSize(300,300);
        f.setVisible(true);
        f.setJMenuBar(mb);
        
        
    }
    public static void main(String[] args) {
        new _menubar();
    }
    
}
