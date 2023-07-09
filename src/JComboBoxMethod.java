import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxMethod {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setSize(1000,700);
        Container container = frame.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.black);


        String[] values = {"A", "b", "c", "d"};
        JComboBox<String> box = new JComboBox<>(values);
        box.setBounds(100, 100, 100, 30);
        container.add(box);

//        box.setSelectedItem("b");
//        box.setEditable(true);
//        box.setSelectedIndex(3);
        JButton button=new JButton("OK");
        button.setBounds(300,100,100,30);
        container.add(button);

        JLabel label=new JLabel();
        label.setBounds(100,300,100,30);
        container.add(label);


        box.addItem("E");
        box.removeItem("E");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                label.setText((String) box.getSelectedItem());
                label.setText(String.valueOf(box.getSelectedIndex()));
            }
        });

        frame.setVisible(true);


    }
}
