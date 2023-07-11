import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {
        MyFrame1 frame1 = new MyFrame1();
    }
}

class MyFrame1 extends JFrame implements ActionListener {

    Container container;
    JLabel jLabel1;
    JLabel jLabel2;
    JPasswordField passwordField;
    JButton button;
    JTextField textField;


    MyFrame1() {
        setTitle("Login Form");
        setSize(400, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        container = getContentPane();
        container.setLayout(null);
        jLabel1 = new JLabel("UserName:-");
        jLabel2 = new JLabel("Password:-");
        jLabel1.setBounds(10, 50, 100, 20);
        jLabel2.setBounds(10, 100, 100, 20);
        container.add(jLabel1);
        container.add(jLabel2);
        textField = new JTextField();
        textField.setBounds(120, 50, 120, 20);
        container.add(textField);
        passwordField = new JPasswordField();
        passwordField.setBounds(120, 100, 120, 20);
        container.add(passwordField);
        button = new JButton("Login");
        button.setBounds(100, 150, 70, 20);
        container.add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("UserName : "+textField.getText());
        System.out.println("password : "+passwordField.getText());
    }
}