import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_3 {
    public static void main(String[] args) {
        MyFrame5 myFrame = new MyFrame5();
        myFrame.setTitle("ActionEvent");
        myFrame.setBounds(100, 100, 400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setResizable(false);

    }
}

class MyFrame5 extends JFrame implements ActionListener {
    JMenuBar bar;
    JMenu file, edit;
    JMenuItem i1, i2, i3, i4, i5, i6, i7;
    JTextArea textArea;

    public MyFrame5() {
        Container c = getContentPane();
        c.setLayout(null);

        bar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");

        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("paste");
        i7 = new JMenuItem("Select All");

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);

        file.add(i1);
        file.add(i2);
        file.add(i3);

        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);

        bar.add(file);
        bar.add(edit);

        this.setJMenuBar(bar);

        textArea = new JTextArea();
        textArea.setBounds(10, 10, 370, 400);
        c.add(textArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == i1) {
            textArea.setText("New File");
        } if (e.getSource() == i2) {
            textArea.setText("Open File");
        } if (e.getSource() == i3) {
            textArea.setText("Save File");
        } if (e.getSource() == i4) {
            textArea.cut();
        } if (e.getSource() == i5) {
            textArea.copy();
        } if (e.getSource() == i6) {
            textArea.paste();
        } if (e.getSource() == i7) {
            textArea.selectAll();
        }

    }
}