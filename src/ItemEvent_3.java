import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_3 {

    public static void main(String[] args) {
        MyFrame_3 myFrame = new MyFrame_3();
        myFrame.setTitle("ItemEvent");
        myFrame.setBounds(100, 100, 400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
    }
}

class MyFrame_3 extends JFrame implements ItemListener {


    TextArea textArea;
    JCheckBox c1, c2, c3, c4;

    public MyFrame_3() {
        Container container = getContentPane();
        container.setLayout(null);
        c1 = new JCheckBox("10th");
        c2 = new JCheckBox("12th");
        c3 = new JCheckBox("Graduate");
        c4 = new JCheckBox("Post-graduate");

        c1.setBounds(50, 50, 100, 30);
        c2.setBounds(50, 100, 100, 30);
        c3.setBounds(50, 150, 100, 30);
        c4.setBounds(50, 200, 100, 30);

        container.add(c1);
        container.add(c2);
        container.add(c3);
        container.add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);


        textArea = new TextArea();
        textArea.setBounds(200, 50, 100, 100);
        container.add(textArea);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (c1.isSelected()) {
            textArea.setText("10th");
        }
        if (c2.isSelected()) {
            textArea.setText(textArea.getText() + "\n" + "12th");
        }
        if (c3.isSelected()) {
            textArea.setText(textArea.getText() + "\n" + "Graduate");
        }
        if (c4.isSelected()) {
            textArea.setText(textArea.getText() + "\n" + "Post-Graduate");
        }

    }

}
