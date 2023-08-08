import javax.swing.*;
import java.awt.*;

public class LayoutsManger_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout Ex");
        frame.setBounds(100, 200, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();

        JButton b1, b2, b3, b4, b5;
        b1 = new JButton("B1");
        b2 = new JButton("B2");
        b3 = new JButton("B3");
        b4 = new JButton("B4");
        b5 = new JButton("B5");

        c.add(b1);
        c.add(b2);
        c.add(b3);
//        c.add(b4);
        c.add(b4,0);
        c.add(b5);

        FlowLayout layout=new FlowLayout();
//        FlowLayout layout=new FlowLayout(FlowLayout.LEFT);
//        FlowLayout layout=new FlowLayout(FlowLayout.RIGHT,10,20);
//        FlowLayout layout=new FlowLayout(FlowLayout.CENTER);

        layout.setHgap(10);
        layout.setVgap(20);
        c.setLayout(layout);




        frame.setVisible(true);

    }
}
