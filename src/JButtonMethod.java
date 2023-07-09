import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class JButtonMethod {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Font font = new Font("Arial", Font.BOLD, 18);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 200, 1000, 800);
        Container container = frame.getContentPane();
        container.setLayout(null);
        JButton button = new JButton();
        button.setSize(120, 30);
        button.setLocation(120, 100);
        button.setText("Click me");
        button.setFont(font);
        button.setForeground(Color.black);
        //button.setBackground(Color.white);
        //button.setCursor(cursor);
        //button.setEnabled(false);
        //button.setVisible(false);

        ImageIcon icon = new ImageIcon("C:\\program1\\program1\\images.png");
        button.setIcon(icon);
        button.setSize(icon.getIconWidth(),icon.getIconHeight());
        container.add(button);

    }
}
