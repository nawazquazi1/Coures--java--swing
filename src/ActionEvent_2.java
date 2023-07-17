import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class ActionEvent_2 {

    public static void main(String[] args) {
        MyFrame4 myFrame = new MyFrame4();
        myFrame.setTitle("ActionEvent");
        myFrame.setBounds(100, 100, 400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

class MyFrame4 extends  JFrame implements ActionListener {
    Container c;
    JTextField textField;
    public MyFrame4() {
        c=this.getContentPane();
        setLayout(null);
        textField=new JTextField();
        textField.setBounds(100,100,100,30);
        c.add(textField);
        textField.addActionListener(this);

        textField.setFont(new Font("arial",Font.BOLD,15));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText().toUpperCase(Locale.ROOT));
    }
}