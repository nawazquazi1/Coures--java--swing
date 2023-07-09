import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonMethodEvent2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Action Demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(100, 100, 700, 500);

        Container container = frame.getContentPane();
        container.setLayout(null);
        JButton button = new JButton("Click me");
        button.setBounds(10, 150, 100, 50);
        container.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setBackground(Color.black);
            }
        });
    }
}
