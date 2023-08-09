import javax.swing.*;
import java.awt.*;

public class JPanel_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Ex");
        frame.setBounds(100, 200, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setBounds(0, 0, 300, 300);
        c.add(panel);
        c.setBackground(Color.white);
        panel.setLayout(null);


        JPanel panel1 = new JPanel();
        panel1.setBounds(300, 0, 200, 200);
        panel1.setBackground(Color.RED);
//        c.add(panel1);
        panel.add(panel1);
        panel1.setBounds(0, 0, 200, 200);
        JButton button = new JButton("Button");
        panel1.add(button);


        frame.setVisible(true);
    }
}
