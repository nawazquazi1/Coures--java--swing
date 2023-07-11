import javax.swing.*;
import java.awt.*;

public class JMenu_Bar {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem item1 = new JMenuItem("new");
        JMenuItem item2 = new JMenuItem("open");
        JMenuItem item3 = new JMenuItem("save");
        file.add(item1);
        file.add(item2);
        file.add(item3);
        menuBar.add(file);
        JMenu edit = new JMenu("Edit");
        JMenuItem item4 = new JMenuItem("undo");
        JMenuItem item5 = new JMenuItem("redo");
        edit.add(item4);
        edit.add(item5);
        menuBar.add(edit);

        frame.setJMenuBar(menuBar);

        frame.setTitle("MenuBar");
        frame.setVisible(true);

    }
}
