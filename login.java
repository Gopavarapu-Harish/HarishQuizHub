import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class login extends JFrame implements ActionListener{
    JButton back,rules;
    JTextField nvalue;
    public login(){
        setLayout(null);
        setSize(900,500);
        setLocation(150,150);
        setTitle("Quiz Application");
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("./icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,500,500);
        add(image);

        JLabel welcome =new JLabel("Welcome To");
        welcome.setForeground(new Color(0,123,255));
        welcome.setFont(new Font("Ubuntu",Font.BOLD,20));
        welcome.setBounds(640,50,250,30);
        add(welcome);

        JLabel heading =new JLabel("HarishQuizHub");
        heading.setForeground(new Color(220,53,69));
        heading.setFont(new Font("Ubuntu",Font.BOLD,25));
        heading.setBounds(620,100,250,30);
        add(heading);

        JLabel name =new JLabel("Enter Your Name");
        name.setForeground(new Color(0,102,204));
        name.setFont(new Font("Century Schoolbook L",Font.BOLD,18));
        name.setBounds(620,200,350,30);
        add(name);

        nvalue =new JTextField();
        nvalue.setForeground(new Color(30,144,254));
        nvalue.setFont(new Font("DejaVu Sans",Font.BOLD,18));
        nvalue.setBounds(530,250,350,30);
        nvalue.setForeground(new Color(0,0,0));
        nvalue.setBackground(new Color(240,240,240));

        rules=new JButton("Rules");
        rules.setBounds(530,350,100,20);
        rules.setBackground(new Color(0, 102, 204));
        rules.setForeground(new Color(255,255,255));
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(770,350,100,20);
        back.setBackground(new Color(0, 102, 204));
        back.setForeground(new Color(255,255,255));
        back.addActionListener(this);
        add(back);
        add(nvalue);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            System.exit(0);
        }
        if(ae.getSource()==rules){
            
            String name=nvalue.getText();
            if(name.equals("")){
                JOptionPane.showMessageDialog(this, "Please enter your name properly", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            setVisible(false);
            new rules(name).setVisible(true);
           
        }
    }
    public static void main(String[] args) {
        new login();
    }
}