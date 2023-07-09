import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonMethodEvent3 {
    public static Container container;
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton();
        JButton button1 = new JButton();
        JButton button2 = new JButton();

        frame.setTitle("Action Demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(100, 100, 700, 500);

        container = frame.getContentPane();
        container.setLayout(null);

        button.setSize(120, 30);
        button.setLocation(10, 150);
        button.setText("ENTER");
        button.setForeground(Color.black);
        button.setBackground(Color.white);
        button1.setSize(120, 30);
        button1.setLocation(150, 150);
        button1.setText("ENTER");
        button1.setForeground(Color.black);
        button1.setBackground(Color.white);
        button2.setSize(120, 30);
        button2.setLocation(300, 150);
        button2.setText("ENTER");
        button2.setForeground(Color.black);
        button2.setBackground(Color.white);

        container.add(button);
        container.add(button1);
        container.add(button2);

        button.addActionListener(new Button());
        button1.addActionListener(new Button1());
        button2.addActionListener(new Button2());
    }
}

class Button implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonMethodEvent3.container.setBackground(Color.RED);

    }
}class Button1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonMethodEvent3.container.setBackground(Color.BLUE);

    }
}class Button2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonMethodEvent3.container.setBackground(Color.PINK);

    }
}
