import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class ItemEvent_1 {

    public static void main(String[] args) {
        MyFrame_1 myFrame = new MyFrame_1();
        myFrame.setTitle("ItemEvent");
        myFrame.setBounds(100, 100, 400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
    }
}
  class MyFrame_1 extends JFrame implements ItemListener {

    JComboBox<String>box;
    TextArea textArea;
      public MyFrame_1()  {
          Container c=getContentPane();
          c.setLayout(null);
          String[] values={"A","B","C","D"};
          box=new JComboBox<>(values);
          box.setBounds(50,50,100,30);
          c.add(box);
          textArea=new TextArea();
          textArea.setBounds(200,50,100,100);
          c.add(textArea);
          box.addItemListener(this);
      }

      @Override
      public void itemStateChanged(ItemEvent e) {
       textArea.setText(Objects.requireNonNull(box.getSelectedItem()).toString());
      }
  }