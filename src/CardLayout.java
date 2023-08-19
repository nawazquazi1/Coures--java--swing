import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayout {

    public static void main(String[] args) {
        JFrame cardLayoutExample = new JFrame();
        cardLayoutExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cardLayoutExample.setBounds(100, 100, 500, 400);
        cardLayoutExample.setTitle("Card Layout Example");
        Container c = cardLayoutExample.getContentPane();
        java.awt.CardLayout layout = new java.awt.CardLayout();
        c.setLayout(layout);

        JButton button1, button2, button3, button4;
        button1 = new JButton("page 1");
        button2 = new JButton("page 2");
        button3 = new JButton("page 3");
        button4 = new JButton("page 4");

        c.add(button1, "1");
        c.add(button2, "2");
        c.add(button3, "3");
        c.add(button4, "4");

        layout.show(c, "3");

        cardLayoutExample.setVisible(true);
    }

}
//class CardLayoutExample extends JFrame implements ActionListener {
//    JPanel cards;
//    JButton button1, button2, button3;
//
//    public CardLayoutExample() {
//        setTitle("Card Layout Example");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        cards = new JPanel((LayoutManager) new CardLayout());
//
//        // Create card panels
//        JPanel card1 = new JPanel();
//        card1.add(new JLabel("Card 1"));
//
//        JPanel card2 = new JPanel();
//        card2.add(new JLabel("Card 2"));
//
//        JPanel card3 = new JPanel();
//        card3.add(new JLabel("Card 3"));
//
//        cards.add(card1, "Card 1");
//        cards.add(card2, "Card 2");
//        cards.add(card3, "Card 3");
//
//        // Create buttons to switch between cards
//        button1 = new JButton("Show Card 1");
//        button1.addActionListener(this);
//
//        button2 = new JButton("Show Card 2");
//        button2.addActionListener(this);
//
//        button3 = new JButton("Show Card 3");
//        button3.addActionListener(this);
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(button1);
//        buttonPanel.add(button2);
//        buttonPanel.add(button3);
//
//        getContentPane().add(cards, BorderLayout.CENTER);
//        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
//
//        pack();
//        setVisible(true);
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        CardLayout cardLayout = (CardLayout) cards.getLayout();
//        if (e.getSource() == button1) {
//            cardLayout.show(cards, "Card 1");
//        } else if (e.getSource() == button2) {
//            cardLayout.show(cards, "Card 2");
//        } else if (e.getSource() == button3) {
//            cardLayout.show(cards, "Card 3");
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new CardLayoutExample();
//            }
//        });
//    }
//}