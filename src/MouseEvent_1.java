import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvent_1 {
    public static void main(String[] args) {
        MyFrame_6 frame_5 = new MyFrame_6();
        frame_5.setTitle("Mouse Event Demo");
        frame_5.setBounds(100, 100, 700, 500);
        frame_5.setVisible(true);
        frame_5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyFrame_6 extends JFrame implements MouseListener {

    JLabel label;
    JTextArea textArea;

    public MyFrame_6() {
        Container c = getContentPane();
        c.setLayout(null);

        label = new JLabel("My Label");
        label.setFont(new Font("arial", Font.BOLD, 18));
        label.setBounds(50, 100, 100, 30);
        c.add(label);

        textArea = new JTextArea();
        textArea.setBounds(200, 50, 300, 300);
        c.add(textArea);

        label.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        textArea.setText(textArea.getText() + "\n" + "Mouse is Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        textArea.setText(textArea.getText() + "\n" + "Mouse is Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        textArea.setText(textArea.getText() + "\n" + "Mouse is Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        textArea.setText(textArea.getText() + "\n" + "Mouse is Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        textArea.setText(textArea.getText() + "\n" + "Mouse is Exited");
    }
}