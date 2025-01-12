import javax.swing.*;
public class SliderExample {
    SliderExample() {
        JFrame f = new JFrame();
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);

       slider.setMinorTickSpacing(2);  // Set the minor tick spacing to the slider.
      slider.setMajorTickSpacing(10); // Set the major tick spacing to the slider.
        slider.setPaintTicks(true);     // Determine whether tick marks are painted.
       slider.setPaintLabels(true);    // Determine whether labels are painted.

        JPanel panel = new JPanel();
        panel.add(slider);
        f.add(panel);
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String[] s) {
       new SliderExample();
        
       
    }
}
