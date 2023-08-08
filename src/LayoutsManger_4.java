import javax.swing.*;
import java.awt.*;

public class LayoutsManger_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("  Grid Layout Ex");
        frame.setBounds(100, 200, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        GridLayout layout = new GridLayout(2,3);


        JButton b1, b2, b3, b4, b5;
        b1 = new JButton("B1");
        b2 = new JButton("B2");
        b3 = new JButton("B3");
        b4 = new JButton("B4");
        b5 = new JButton("B5");

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        c.setLayout(layout);

        frame.setVisible(true);


    }
}
