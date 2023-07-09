import javax.swing.*;
import java.awt.*;

public class JPasswordMethod {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Font font = new Font("Arial", Font.BOLD, 18);
        Container container = frame.getContentPane();
        JPasswordField passwordField = new JPasswordField();
        JLabel label2 = new JLabel();
        JLabel label = new JLabel();
        JTextField jTextField = new JTextField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setLayout(null);
        frame.setBounds(100, 200, 1000, 800);
        label2.setBounds(0, 100, 120, 30);
        passwordField.setBounds(120, 100, 120, 30);
        label.setBounds(0, 50, 120, 30);
        jTextField.setBounds(120, 50, 120, 30);
        jTextField.setFont(font);
        label.setFont(font);
        label2.setFont(font);
        passwordField.setFont(font);
        label.setText("UserNAME :-");
        label2.setText("Password :-");
        passwordField.setEchoChar('*');
        passwordField.setEchoChar((char) 0);
        container.add(label2);
        container.add(passwordField);
        container.add(label);
        container.add(jTextField);
        container.add(jTextField);
    }
}
