import javax.swing.*;
import java.awt.*;

public class JRadioButtonMethod {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.black);
        JRadioButton maile = new JRadioButton("Maile");
        maile.setBounds(100, 50, 100, 20);
        container.add(maile);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(200, 50, 100, 20);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(maile);
        group.add(female);

        maile.setSelected(true);

        JRadioButton gen = new JRadioButton("General");
        JRadioButton obc = new JRadioButton("Obc");
        JRadioButton sc = new JRadioButton("Sc");
        JRadioButton st = new JRadioButton("St");

        gen.setBounds(100, 100, 100, 20);
        obc.setBounds(200, 100, 100, 20);
        sc.setBounds(300, 100, 100, 20);
        st.setBounds(400, 100, 100, 20);

        gen.setSelected(true);
        obc.setEnabled(false);
        container.add(gen);
        container.add(obc);
        container.add(sc);
        container.add(st);

        frame.setResizable(false);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(gen);
        buttonGroup.add(obc);
        buttonGroup.add(sc);
        buttonGroup.add(st);

        frame.setVisible(true);
    }
}
