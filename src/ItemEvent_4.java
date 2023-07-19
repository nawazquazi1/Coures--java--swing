import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_4 {
    public static void main(String[] args) {
        MyFrame_4 myFrame = new MyFrame_4();
        myFrame.setTitle("ItemEvent");
        myFrame.setBounds(100, 100, 400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setResizable(false);

    }
}

class MyFrame_4 extends JFrame implements ItemListener {


    TextArea textArea;
    JMenuBar bar;
    JMenu menu;
    JCheckBoxMenuItem c1;

    public MyFrame_4() {
        Container container = getContentPane();
        container.setLayout(null);

        bar = new JMenuBar();
        menu = new JMenu("File");

        c1 = new JCheckBoxMenuItem("Print");
        menu.add(c1);
        bar.add(menu);
        this.setJMenuBar(bar);

        c1.addItemListener(this);


        textArea = new TextArea();
        textArea.setBounds(200, 50, 100, 100);
        container.add(textArea);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (c1.isSelected()) {
            textArea.setText("Print is ON");
        } else {
            textArea.setText("Print is OFF");
        }

    }
}
