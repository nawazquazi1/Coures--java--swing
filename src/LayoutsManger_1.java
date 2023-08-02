import javax.swing.*;
import java.awt.*;

public class LayoutsManger_1 {
    // Null Layout
    public static void main(String[] args) {
        JFrame frame=new JFrame("Null Layout Ex");
        frame.setBounds(300,200,500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Container c=frame.getContentPane();
        JButton b1,b2,b3,b4;
        b1=new JButton("B1");
        b2=new JButton("B2");
        b3=new JButton("B3");
        b4=new JButton("B4");


        b1.setBounds(20,20,80,30);
        b2.setBounds(120,20,80,30);
        b3.setBounds(220,20,80,30);
        b4.setBounds(20,100,80,30);

        c.setLayout(null);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);

    }
}
