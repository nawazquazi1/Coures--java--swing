import javax.swing.*;
import javax.swing.event.CaretListener;
import java.awt.*;

public class CaretEvent {
    public static void main(String[] args) {
        MyFrame_9 frame_5 = new MyFrame_9();
        frame_5.setTitle("Caret Event Demo");
        frame_5.setBounds(100, 100, 700, 500);
        frame_5.setVisible(true);
        frame_5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyFrame_9 extends JFrame implements CaretListener {

    JTextField field;
    JTextArea textArea;

    public MyFrame_9() {
        Container c = getContentPane();
        c.setLayout(null);

        field = new JTextField(" ");
        field.setFont(new Font("arial", Font.BOLD, 18));
        field.setBounds(50, 100, 100, 30);
        c.add(field);

        textArea = new JTextArea();
        textArea.setBounds(200, 50, 300, 300);
        c.add(textArea);
field.addCaretListener(this);

    }

    @Override
    public void caretUpdate(javax.swing.event.CaretEvent e) {
        textArea.setText(textArea.getText()+"\n"+"Caret Updated "+e.getDot()+" "+e.getMark());
    }
}