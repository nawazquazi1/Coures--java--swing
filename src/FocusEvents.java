import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FocusEvents {
    public static void main(String[] args) {
        MyFrame_8 frame_5 = new MyFrame_8();
        frame_5.setTitle("Focus Event Demo");
        frame_5.setBounds(100, 100, 700, 500);
        frame_5.setVisible(true);
        frame_5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyFrame_8 extends JFrame implements FocusListener {


    JTextField field;
    JTextArea textArea;

    public MyFrame_8() {
        Container c = getContentPane();
        c.setLayout(null);

        field = new JTextField(" ");
        field.setFont(new Font("arial", Font.BOLD, 18));
        field.setBounds(50, 100, 100, 30);
        c.add(field);

        textArea = new JTextArea();
        textArea.setBounds(200, 50, 300, 300);
        c.add(textArea);
        field.addFocusListener(this);

    }

    @Override
    public void focusGained(FocusEvent e) {
        textArea.setText(textArea.getText()+"\n"+"Text Box Focus gained" );
    }

    @Override
    public void focusLost(FocusEvent e) {
        textArea.setText(textArea.getText()+"\n"+"Text Box Focus Lost" );
    }
}