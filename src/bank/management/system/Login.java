package bank.management.system;

import javax.swing.*; //javax --> java extend library
import java.awt.*;   // FOR placing image
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");    // Title name
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);  // from jlabel we can write on content 
        label.setBounds(70, 10, 100, 100); //distance from leftHandSide
        add(label);
        
        // text rigth to item icon
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));  //font change 
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel Cardno = new JLabel("Card No:");
        Cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        Cardno.setBounds(120, 150, 150, 30);
        add(Cardno);
        
        cardTextField =  new JTextField();  // input textbox
        cardTextField.setBounds(300,150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
        pinTextField =  new JPasswordField();  // input textbox // it will display ....
        pinTextField.setBounds(300,220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300,100,30 );
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);   //it shows you have clicked on button
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300,100,30 );
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350,230,30 );
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
                
        getContentPane().setBackground(Color.WHITE);    //  frame of background color
        
        setSize(800, 480);  // Frame form //length, bredth
        setVisible(true);      // default false
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText(""); 
        }
        else if(ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "Select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{            
                ResultSet rs = conn.s.executeQuery(query); 
                if (rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect card number or pin");
                }

            
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == signup ){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
        
        
    }
    public static void main(String args[]){
        new Login();
    }
    
}
