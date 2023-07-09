import javax.swing.*;
import java.awt.*;

public class JCheckBoxMethod {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.black);

        JCheckBox checkBox=new JCheckBox("High School");
        JCheckBox checkBox1=new JCheckBox("Intermediate");
        JCheckBox checkBox2=new JCheckBox("Graduation");
        JCheckBox checkBox3=new JCheckBox("Post-Graduation");

        checkBox.setBounds(100,50,120,20);
        checkBox1.setBounds(100,100,120,20);
        checkBox2.setBounds(100,150,120,20);
        checkBox3.setBounds(100,200,120,20);
        checkBox.setSelected(true);

        container.add(checkBox);
        container.add(checkBox1);
        container.add(checkBox2);
        container.add(checkBox3);


        frame.setVisible(true);
    }
}
