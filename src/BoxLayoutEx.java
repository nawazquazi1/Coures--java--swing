import javax.swing.*;
import java.awt.*;

public class BoxLayoutEx {
}


class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 400);

        Container c=frame.getContentPane();
        BoxLayout layout=new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(layout);
        JButton button1, button2, button3, button4;
        button1 = new JButton("button 1");
        button2 = new JButton("button 2 --");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4 --");

        button1.setAlignmentX(Component.LEFT_ALIGNMENT);
        button2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);
        button4.setAlignmentX(Component.BOTTOM_ALIGNMENT);

        c.add(button1);
        c.add(Box.createRigidArea(new Dimension(0,80)));
        c.add(button3);
        c.add(button4);


        frame.setVisible(true);

    }
}
