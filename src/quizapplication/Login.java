package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {
JButton rules;
JTextField userName;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        userName = new JTextField();
        userName.setBounds(735,200,300,25);
        userName.setFont(new Font("Time New Roman", Font.BOLD, 15));
        add(userName);
        
        rules = new JButton("Start Quiz");
        rules.setBounds(800,270,180,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        setSize(1200,500);
        setLocation(100,100);
        setVisible(true);
    }

            
       public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = userName.getText();
            setVisible(false);
            new Rules(name);
        }   
       }
        
    public static void main(String[] args){
        new Login();
    }
}
