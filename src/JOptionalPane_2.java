import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionalPane_2 {
    public static void main(String[] args) {
        // Create a text field panel
        JTextField textField = new JTextField(10);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter your name:"));
        panel.add(textField);

        // Show the option pane dialog with the panel
        int result = JOptionPane.showOptionDialog(null, panel, "Enter Name",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

        // Handle the result
        if (result == JOptionPane.OK_OPTION) {
            String name = textField.getText();
            JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
        } else {
            JOptionPane.showMessageDialog(null, "No name entered!");
        }
    }
}
class SwingExample extends JFrame {

    public SwingExample() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        setTitle("Java Swing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create JPanel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        // Create JButton
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show JOptionPane when button is clicked
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        // Add JButton to JPanel
        panel.add(button);

        // Add JPanel to JFrame
        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}
