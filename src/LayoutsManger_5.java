import javax.swing.*;
import java.awt.*;

public class LayoutsManger_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBag Layout Ex");
        frame.setBounds(100, 200, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();

        JButton b1, b2, b3, b4, b5;
        b1 = new JButton("B1");
        b2 = new JButton("B2");
        b3 = new JButton("B3");
        b4 = new JButton("B4");
        b5 = new JButton("B5");

        GridBagLayout layout = new GridBagLayout();
        c.setLayout(layout);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.5;//Request for extra space horizontally
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        c.add(b1, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        c.add(b2, gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        c.add(b3, gridBagConstraints);

        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady=40;
        c.add(b4, gridBagConstraints);

        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady=0;
        gridBagConstraints.anchor=GridBagConstraints.PAGE_END;
        gridBagConstraints.weighty=1;
        c.add(b5, gridBagConstraints);



        frame.pack();

        frame.setVisible(true);

    }
}



