import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JOptionalPane_3 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Add a JButton to the panel
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a JDialog
                JDialog dialog = new JDialog();
                dialog.setTitle("Dialog");
                dialog.setSize(200, 100);

                // Add a JLabel to the dialog
                JLabel label = new JLabel("Dialog Label");
                dialog.add(label);

                // Set the dialog to be visible
                dialog.setVisible(true);
            }
        });
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}


class Main {
    public static void main(String[] args) {
        // Create an array of components for the dialog fields
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        Object[] message = {
                "Username:", usernameField,
                "Password:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Do something with the entered username and password
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
    }
}
