import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;  

public class ApplyForm extends JFrame implements ActionListener   
{  
    JLabel lab1, lab2, lab3, lab4, lab5, lab6, lab7, lab8;  
    JTextField tf1, tf2, tf3, tf5, tf6;  
    JButton btn1, btn2;
    JRadioButton r1=new JRadioButton("A)Male");
    JRadioButton r2=new JRadioButton("B)Female");  
    JComboBox c;
    JPasswordField p1, p2;  
    ApplyForm()  
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Admit Form::");  
        lab1 = new JLabel("Registration Form in Windows Form:");  
        lab1.setForeground(Color.black);  
        lab1.setFont(new Font("Serif", Font.BOLD, 20));  
        lab2 = new JLabel("Name:");  
        lab3 = new JLabel("Phone no:");  
        lab4 = new JLabel("Email:");  
        lab5 = new JLabel("Password:");  
        lab6 = new JLabel("Address:");  
        lab7 = new JLabel("City:");  
        lab8 =new JLabel("Gender:");
         String s[]={"Thatta","Jamshoro"};
         c=new JComboBox(s);  
        tf1 = new JTextField();  
        tf2 = new JTextField();
        tf3 = new JTextField();  
         
          
        tf5 = new JTextField(); 
         p1 = new JPasswordField();
        tf6 = new JTextField();  
         
        
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Clear");
          
        
        btn1.addActionListener(this);  
        btn2.addActionListener(this);
          
        lab1.setBounds(100, 30, 400, 30);  
        lab2.setBounds(80, 70, 200, 30);  
        lab3.setBounds(80, 110, 200, 30);  
        lab4.setBounds(90, 150, 200, 30);  
        lab5.setBounds(80, 190, 200, 30);  
        lab6.setBounds(80, 230, 200, 30);  
        lab7.setBounds(80, 270, 200, 30);
        lab8.setBounds(80, 330, 200, 30);  
          
        tf1.setBounds(300, 70, 200, 30);  
        tf2.setBounds(300, 110, 200, 30); 
        tf3.setBounds(301,130,200,30) ;
        p1.setBounds(300, 150, 200, 30);  
          
        tf5.setBounds(300, 200, 200, 30);  
        tf6.setBounds(300, 240, 200, 30);  
           c.setBounds(300, 290, 200, 30) ;
        r1.setBounds(300, 330, 200, 30);
        r2.setBounds(300, 370 , 200, 30);
        btn1.setBounds(50, 470, 100, 30);  
        btn2.setBounds(170, 470, 100, 30);
        
         ButtonGroup bg=new ButtonGroup();
         bg.add(r1);bg.add(r2);


        add(lab1);  
        add(lab2);  
        add(tf1);  
        add(lab3);  
        add(tf2);  
        add(lab4);  
        add(tf3);  
        add(lab5);
        add(tf5);  
        add(tf6) ; 
        add(lab6);
        add(tf6);
        add(lab7);  
        add(c); 
        add(lab8);
          
        add(btn1);  
        add(btn2);  

        add(r1);
        add(r2);
        
    }  
    public void actionPerformed(ActionEvent e)   
    {  
        if (e.getSource() == btn1)  
         {  
           
            String s1 = tf1.getText();  
            String s2 = tf2.getText();
            String s3 = tf3.getText();              
            char[] s4 = p1.getPassword();  
              
            
 String s5 = tf5.getText();
            String s8 = new String(s3);  
           
              
             
            String s6 = tf6.getText();  
            
            
          }else  
           {
            tf1.setText("");  
            tf2.setText("");  
           // p1.setText("");  
             
            tf5.setText(""); 
             p1.setText(""); 
            tf6.setText(""); 
             
          
    }
    }   
    public static void main(String args[])  
    {  
        new ApplyForm();  
    }  
 
}