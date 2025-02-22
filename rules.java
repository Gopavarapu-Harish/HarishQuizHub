import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class rules extends JFrame implements ActionListener {
    String name;
    JButton next,back;
    public rules(String name){
        this.name=name;
        setLayout(null);
        setSize(900,500);
        getContentPane().setBackground(Color.WHITE);
        setLocation(150,150);
        setTitle("Rules");

        JLabel heading =new JLabel("Welcome "+name+" to HarishQuizHub");
        heading.setForeground(new Color(0,153,76));
        heading.setFont(new Font("Ubuntu",Font.BOLD,18));
        heading.setBounds(50,30,350,30);
        add(heading);

        JLabel Rules=new JLabel("");
        Rules.setFont(new Font("SansSerif",Font.BOLD,12));
        Rules.setBounds(50,10,700,420);
        Rules.setText(
            "<html>"+
            "<B color='red'>Rules:<B>"+"<br><br>"+
            "1) Each participant must enter their Full Name before starting the quiz."+"<br><br>"+
            "2) The quiz consists of multiple-choice questions, and only one answer is correct per question."+"<br><br>"+
            "3) Each question has a time limit; failing to answer within the time will be considered incorrect."+"<br><br>"+
            "4) Once an answer is submitted, it cannot be changed."+"<br><br>"+
            "5) No external help (books, internet, or assistance) is allowed during the quiz."+"<br><br>"+
            "6) Each correct answer earns points, and there are no negative marks for incorrect answers."+"<br><br>"+
            "7) At the end of the quiz, the final score will be displayed."+"<br><br>"+
            "8) Participants must maintain fairness and honesty. Any attempt to cheat may lead to disqualification."+"<br><br>"+
            "</html>"
        );
        add(Rules);

        next=new JButton("START");
        next.setBounds(580,390,100,20);
        next.setBackground(new Color(0, 102, 204));
        next.setForeground(new Color(255,255,255));
        next.addActionListener(this);
        add(next);

        back=new JButton("BACK");
        back.setBounds(50,390,100,20);
        back.setBackground(new Color(0, 102, 204));
        back.setForeground(new Color(255,255,255));
        back.addActionListener(this);
        add(back);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new login().setVisible(true);
        }
        if(ae.getSource()==next){
            setVisible(false);
            new quiz(name).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new rules("");
    }
}
