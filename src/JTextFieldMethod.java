import javax.swing.*;
import java.awt.*;

public class JTextFieldMethod {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 200, 1000, 800);
        Container container = frame.getContentPane();
        container.setLayout(null);
        JTextField jTextField = new JTextField();
        jTextField.setBounds(120, 50, 120, 30);
        Font font = new Font("Arial", Font.BOLD, 18);
        jTextField.setFont(font);
        jTextField.setForeground(Color.green);
        jTextField.setBackground(Color.black);
        jTextField.setEditable(false);
        JLabel label = new JLabel();
        label.setText("UserNAME :-");
        label.setBounds(0, 50, 120, 30);
        label.setFont(font);
        container.add(label);
        container.add(jTextField);
        jTextField.setText("UserNAME");


    }
}
