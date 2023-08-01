import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseEvent_2 {

    public static void main(String[] args) {

        MyFrame_7 frame_5 = new MyFrame_7();
        frame_5.setTitle("Mouse Event Demo");
        frame_5.setBounds(100, 100, 700, 500);
        frame_5.setVisible(true);
        frame_5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyFrame_7 extends JFrame implements MouseMotionListener{



    JLabel label;
    JTextArea textArea;

    public MyFrame_7() {
        Container c = getContentPane();
        c.setLayout(null);

        label = new JLabel("My Label");
        label.setFont(new Font("arial", Font.BOLD, 18));
        label.setBounds(50, 100, 100, 30);
        c.add(label);

        textArea = new JTextArea();
        textArea.setBounds(200, 50, 300, 300);
        c.add(textArea);
        label.addMouseMotionListener(this);

    }


    @Override
    public void mouseDragged(MouseEvent e) {
        textArea.setText(textArea.getText()+"\n"+"Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
textArea.setText(textArea.getText()+"\n"+"Mouse Moved");
    }
}