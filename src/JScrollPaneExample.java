import javax.swing.*;
import java.awt.*;

public class JScrollPaneExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JTextArea
        JTextArea textArea = new JTextArea(5, 20);

        // Create a JScrollPane and add the JTextArea to it
        JScrollPane scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Add the JScrollPane to the JFrame
        frame.getContentPane().add(scrollPane);

        // Display the JFrame
        frame.setVisible(true);
    }
}