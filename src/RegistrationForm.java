import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {

    public static void main(String[] args) {

        Frame frame = new Frame();
    }


}

class Frame extends JFrame implements ActionListener {
    JLabel label, label1, label2, label3, label4, label5, massage;
    JTextArea textArea;
    JTextField textField, textField1,textField2;
    JRadioButton male, female, submit;
    JComboBox<Integer> day;
    JComboBox<String> month;
    JComboBox<Integer> year;
    JCheckBox terms;
    Container container;


    Frame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700, 500);
        setTitle("Registration Form");
        setResizable(false);
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.BLACK);
        label = new JLabel("Name :- ");
        label.setBounds(20, 50, 100, 20);
        label.setForeground(Color.white);
        container.add(label);

        textField = new JTextField();
        textField.setBounds(130, 50, 100, 20);
        container.add(textField);

        label1 = new JLabel("Mobile No :- ");
        label1.setBounds(20, 100, 100, 20);
        label1.setForeground(Color.white);
        container.add(label1);

        textField1 = new JTextField();
        textField1.setBounds(130, 100, 100, 20);
        container.add(textField1);

        label3 = new JLabel("Gender :- ");
        label3.setForeground(Color.white);
        label3.setBounds(20, 150, 200, 20);
        container.add(label3);


        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(130, 150, 80, 20);
        female.setBounds(220, 150, 80, 20);

        male.setSelected(true);

        Integer[]days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Integer[] years={1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023};


        day = new JComboBox<>(days);
        month = new JComboBox<>(months);
        year = new JComboBox<>(years);
        day.setEditable(true);
        month.setEditable(true);
        year.setEditable(true);


        day.setBounds(130,200,50,20);
        month.setBounds(190,200,80,20);
        year.setBounds(300,200,60,20);

        container.add(day);
        container.add(month);
        container.add(year);

        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);


        label2=new JLabel("Address :- ");
        label2.setBounds(20,250,100,20);
        label2.setForeground(Color.white);
        container.add(label2);

        textField2=new JTextField();
        textField2.setBounds(130,240,200,50);;
        container.add(textField2);

        terms=new JCheckBox("Please accept terms and conditions ");
        terms.setBounds(50,300,250,20);
        container.add(terms);

        submit=new JRadioButton("Submit");
        submit.setBounds(150,350,80,20);
        container.add(submit);


        textArea=new JTextArea();
        textArea.setBounds(400,50,300,300);
        container.add(textArea);
        label4=new JLabel("");
        label4.setBounds(20,400,300,20);
        label4.setForeground(Color.white);
        container.add(label4);
         submit.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (terms.isSelected()){
            label4.setText("Registration Successful");
            String name=textField.getText();
            String mobile=textField1.getText();

            String gender="male";
            if (female.isSelected()){
                gender="female";
            }
            String dob=day.getSelectedItem() +"/"+month.getSelectedItem()+"/" +year.getSelectedItem();
            String add=textField2.getText();

            textArea.setText("name : "+ name +"\nMobileNo. : "+mobile+"\nGender : "+gender+"\nDob :"+dob+"\nAdders :"+add);
        }else {
            label4.setText("Please Check terms and conditions");
        }
    }
}