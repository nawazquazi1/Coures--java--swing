import javax.swing.*;
import java.awt.*;

public class ActionEvent_3 {
    public static void main(String[] args) {
        MyFrame5 myFrame = new MyFrame5();
        myFrame.setTitle("ActionEvent");
        myFrame.setBounds(100, 100, 400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

class MyFrame5 extends JFrame {
    JMenuBar bar;
    JMenu file,edit;
    JMenuItem i1,i2,i3,i4,i5,i6,i7;
    JTextField textField;
    public MyFrame5() {
        Container c=getContentPane();
        c.setLayout(null);

        bar=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");

        i1=new JMenuItem("New");
        i2=new JMenuItem("Open");
        i3=new JMenuItem("Save");
        i4=new JMenuItem("Cut");
        i5=new JMenuItem("Copy");
        i6=new JMenuItem("paste");
        i7=new JMenuItem("Select All");

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
    }
}