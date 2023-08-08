import javax.swing.*;
import java.awt.*;

public class LayoutsManger_2 {


    // Border Layout
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Ex");
        frame.setBounds(300, 200, 500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        BorderLayout layout = new BorderLayout();
        layout.setHgap(10);
        layout.setVgap(10);

        Container c = frame.getContentPane();
        JButton b1, b2, b3, b4, b5;
        b1 = new JButton("B1");
        b2 = new JButton("B2");
        b3 = new JButton("B3");
        b4 = new JButton("B4");
        b5 = new JButton("B5");

        c.setLayout(layout);

        c.add(b1, BorderLayout.PAGE_START);
        c.add(b2, BorderLayout.PAGE_END);
        c.add(b3, BorderLayout.LINE_START);
        c.add(b4, BorderLayout.CENTER);
        c.add(b5, BorderLayout.LINE_END);

    }


}
