import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class score extends JFrame implements ActionListener{
    JButton again;
    public score(String username,int score){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(150,30,1100,650);
        setTitle("HarishQuizHub");
        JLabel text=new JLabel("Thank You for playing HarishQuizHub");
        text.setBounds(350,30,600,20);
        text.setFont(new Font("System",Font.BOLD,20));
        add(text);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("./icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,90,1100,350);
        add(image);

        JLabel uscore=new JLabel("Your score is "+score+" out of 100.");
        uscore.setBounds(400,460,600,20);
        uscore.setFont(new Font("System",Font.BOLD,18));
        uscore.setForeground(Color.GREEN);
        add(uscore);

        again=new JButton("Play Again");
        again.setBounds(450,490,150,20);
        again.setBackground(new Color(0, 102, 204));
        again.setForeground(new Color(255,255,255));
        again.addActionListener(this);
        add(again);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==again){
            setVisible(false);
            new login().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new score("",0);
    }
}
