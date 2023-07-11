import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        MyFrame2 myFrame2 = new MyFrame2();
    }
}

class MyFrame2 extends JFrame implements ActionListener {

    private Container container;
    private JLabel jLabel1, jLabel2, jLabel3;
    private JTextField textField1, textField2;
    private JButton add, sub, mul, div;
    private Font font;

    MyFrame2() {
        font = new Font("Arial", Font.BOLD, 18);
        setTitle("Simple Calculator");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        container = getContentPane();
        container.setLayout(null);

        jLabel1 = new JLabel("First number : ");
        jLabel1.setBounds(10, 20, 100, 20);
//        jLabel1.setFont(font);
        container.add(jLabel1);

        textField1 = new JTextField();
        textField1.setBounds(120, 20, 100, 20);
        textField1.setFont(font);
        container.add(textField1);

        jLabel2 = new JLabel("First number : ");
        jLabel2.setBounds(10, 50, 100, 20);
//        jLabel2.setFont(font);
        container.add(jLabel2);

        textField2 = new JTextField();
        textField2.setBounds(120, 50, 100, 20);
        textField2.setFont(font);
        container.add(textField2);

        add = new JButton("+");
        add.setBounds(10, 80, 70, 30);
        add.setFont(font);
        add.setBackground(Color.white);
        container.add(add);
        sub = new JButton("-");
        sub.setBounds(100, 80, 70, 30);
        sub.setFont(font);
        sub.setBackground(Color.white);
        container.add(sub);
        mul = new JButton("*");
        mul.setBounds(200, 80, 70, 30);
        mul.setFont(font);
        mul.setBackground(Color.white);
        container.add(mul);
        div = new JButton("/");
        div.setBounds(300, 80, 70, 30);
        div.setFont(font);
        div.setBackground(Color.white);
        container.add(div);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);


        jLabel3 = new JLabel("Result : ");
        jLabel3.setBounds(10, 120, 150, 20);
        container.add(jLabel3);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(textField1.getText());
            int n2 = Integer.parseInt(textField2.getText());
            int result;
            if (e.getSource() == add) {
                result = n1 + n2;
                jLabel3.setText("Result : " + result);
            } else if (e.getSource() == sub) {
                result = n1 - n2;
                jLabel3.setText("Result : " + result);
            } else if (e.getSource() == mul) {
                result = n1 * n2;
                jLabel3.setText("Result : " + result);
            } else if (e.getSource() == div) {
                result = n1 / n2;
                jLabel3.setText("Result : " + result);
            }
        }catch (NumberFormatException n ){
            jLabel3.setText("Please input integers only");
        }catch (ArithmeticException i){
            jLabel3.setText("Can not divide by Zero");
        }
    }
}