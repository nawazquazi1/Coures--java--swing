import javax.swing.*;
import java.awt.*;

public class JLabelMethod {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 200, 1000, 800);
        Container container = frame.getContentPane();
        container.setLayout(null);
//        JLabel label = new JLabel("UserName");
//        label.setBounds(100, 50, 200, 30);
        //label.setText("Password");
        //Font font=new Font("Arial",Font.ITALIC,30);
        //label.setFont(font);

        ImageIcon icon = new ImageIcon("C:\\program1\\program1\\download.png");
        JLabel label1 = new JLabel("TEXt", icon, JLabel.LEFT);
        label1.setBounds(0, 100, 500, 100);

        container.add(label1);


    }
}
