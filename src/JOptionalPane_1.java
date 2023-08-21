
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JOptionalPane_1 extends JFrame {
    private JButton chooseFileBtn;

    public JOptionalPane_1() {
        setTitle("File Input Dialog Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        chooseFileBtn = new JButton("Choose File");
        chooseFileBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(JOptionalPane_1.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(JOptionalPane_1.this,
                            "Selected file: " + selectedFile.getAbsolutePath());
                }
            }
        });

        add(chooseFileBtn);
    }

    public static void main(String[] args) {
        JOptionalPane_1 example = new JOptionalPane_1();
        example.setVisible(true);
    }
}
