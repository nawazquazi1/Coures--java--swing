import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class ItemEvent_2 {
    public static void main(String[] args) {
        MyFrame_2 myFrame = new MyFrame_2();
        myFrame.setTitle("ItemEvent");
        myFrame.setBounds(100, 100, 400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
    }
}

class MyFrame_2 extends JFrame implements ItemListener {


    TextArea textArea;
JRadioButton male,female;
    public MyFrame_2() {
        Container c = getContentPane();
        c.setLayout(null);

        male=new JRadioButton("Male");
        male.setBounds(50,50,100,20);
        c.add(male);
        female=new JRadioButton("Female");
        female.setBounds(50,100,100,20);
        c.add(female);

        ButtonGroup group=new ButtonGroup();
        group.add(male);
        group.add(female);

        male.addItemListener(this);
        female.addItemListener(this);

        textArea = new TextArea();
        textArea.setBounds(200, 50, 100, 100);
        c.add(textArea);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource()==male){
            textArea.setText("Male");
        }else{
            textArea.setText("Female");
        }
    }
}
