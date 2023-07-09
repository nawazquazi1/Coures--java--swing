import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    Container container;
    JButton button = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();


    MyFrame() {
        container = this.getContentPane();
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
        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        container.add(button);
        container.add(button1);
        container.add(button2);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            container.setBackground(Color.orange);
        } else if (e.getSource()== button1) {
            container.setBackground(Color.white);
        }else if (e.getSource()==button2){
            container.setBackground(Color.green);
        }
    }
}
