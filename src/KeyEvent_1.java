import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvent_1 {
    public static void main(String[] args) {
        MyFrame_5 frame_5 = new MyFrame_5();
        frame_5.setTitle("Key Event Demo");
        frame_5.setBounds(100, 100, 400, 400);
        frame_5.setVisible(true);
        frame_5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MyFrame_5 extends JFrame implements KeyListener {


    JTextArea textArea;

    public MyFrame_5() {
        Container c = getContentPane();
        c.setLayout(null);
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 370, 380);
        c.add(textArea);
        textArea.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        textArea.setText(textArea.getText()+"\n"+"Key is Typed : "+e.getKeyChar());

    }

    @Override
    public void keyPressed(KeyEvent e) {
        textArea.setText(textArea.getText()+"\n"+"Key is Pressed : "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        textArea.setText(textArea.getText()+"\n"+"Key is Released : "+e.getKeyChar());


    }
}