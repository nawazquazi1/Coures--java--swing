import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class ActionEvent_1 {

    public static void main(String[] args) {
        MyFrame3 myFrame = new MyFrame3();
        myFrame.setTitle("ActionEvent");
        myFrame.setBounds(100, 100, 400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

   class MyFrame3 extends  JFrame implements ActionListener {
    Container c;
    JButton button;
    public MyFrame3() {
        c=this.getContentPane();
        button=new JButton("Click me");
        button.setBounds(100,100,100,30);
        c.add(button);
        button.addActionListener(this);
    }

       @Override
       public void actionPerformed(ActionEvent e) {
           button.setText(button.getText().toUpperCase(Locale.ROOT));
       }
   }