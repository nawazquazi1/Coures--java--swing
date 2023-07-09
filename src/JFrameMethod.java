import javax.swing.*;
import java.awt.*;

public class JFrameMethod {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 300);
        frame.setLocation(100, 100);
        frame.setBounds(100, 200, 1000, 800);
        frame.setTitle("My First Frame");
        ImageIcon icon = new ImageIcon("C:\\program1\\program1\\download.png");
        frame.setIconImage(icon.getImage());
        Container c = frame.getContentPane();
        c.setBackground(Color.BLUE);
        frame.setResizable(false);
    }
}
