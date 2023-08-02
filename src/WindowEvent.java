import javax.swing.*;
import java.awt.event.WindowListener;

public class WindowEvent {
    public static void main(String[] args) {
        MyFrame_10 frame_10 = new MyFrame_10();
        frame_10.setTitle("Window Events Example");
        frame_10.setVisible(true);
        frame_10.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_10.setBounds(100, 100, 400, 400);
    }
}

class MyFrame_10 extends JFrame implements WindowListener {
    public MyFrame_10() {
        this.addWindowListener(this);

    }

    @Override
    public void windowOpened(java.awt.event.WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {
        System.out.println("windowClosing");
    }

    @Override
    public void windowClosed(java.awt.event.WindowEvent e) {
        System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(java.awt.event.WindowEvent e) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(java.awt.event.WindowEvent e) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(java.awt.event.WindowEvent e) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(java.awt.event.WindowEvent e) {
        System.out.println("windowDeactivated");
    }
}