import javax.swing.*;
import java.awt.*;

public class JTExtAreaMethod {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container=frame.getContentPane();
        container.setLayout(null);
        JTextArea area=new JTextArea();
        container.add(area);
        area.setBounds(100,100,400,200);
        area.setLineWrap(true);
        frame.setVisible(true);


    }

}
