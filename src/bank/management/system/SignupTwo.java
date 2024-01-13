 package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupTwo extends JFrame implements ActionListener{
    // global
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, occupation, education, income;
    String formno;
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("New Account Application Form - Page 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details" );  // 4 digit unique no 
        additionalDetails.setFont(new Font("Raleway" ,Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:" );  // 4 digit unique no 
        name.setFont(new Font("Raleway" ,Font.BOLD, 22));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);  //drop down 
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname = new JLabel("Category:" );  // 4 digit unique no 
        fname.setFont(new Font("Raleway" ,Font.BOLD, 22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income:" );  // 4 digit unique no 
        dob.setFont(new Font("Raleway" ,Font.BOLD, 22));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomecategory[] = {"Null", "< 1,50,000", "<2,50,000","<5,00,000", "upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel gender = new JLabel("Educational: " );  // 4 digit unique no 
        gender.setFont(new Font("Raleway" ,Font.BOLD, 22));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        JLabel email = new JLabel("Qualification " );  // 4 digit unique no 
        email.setFont(new Font("Raleway" ,Font.BOLD, 22));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValue[] = {"Non Graduate", "Graduate", "Post Graduate", "Docttrate" , "Others"};
        education = new JComboBox(educationValue);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel marital = new JLabel("Occupation:" );  // 4 digit unique no 
        marital.setFont(new Font("Raleway" ,Font.BOLD, 22));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String occupationValue[] = {"Salaried", "Self-Employed", "Business", "retired" , "Others"};
        occupation = new JComboBox(occupationValue);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel address = new JLabel("PAN Number" );  // 4 digit unique no 
        address.setFont(new Font("Raleway" ,Font.BOLD, 22));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city = new JLabel("Aadhar Number:" );  // 4 digit unique no 
        city.setFont(new Font("Raleway" ,Font.BOLD, 22));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen: " );  // 4 digit unique no 
        state.setFont(new Font("Raleway" ,Font.BOLD, 22));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);        
        
        JLabel pincode = new JLabel("Existing Account:" );  // 4 digit unique no 
        pincode.setFont(new Font("Raleway" ,Font.BOLD, 22));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno); 
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);   // background color and frame
        
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    
    } 
        public void actionPerformed(ActionEvent ae){
//          String formno = "" + random;
            String sreligion = (String)religion.getSelectedItem(); // value can be extracted
            String scategory = (String) category.getSelectedItem();
            String sincome = (String) income.getSelectedItem();
            String seducation = (String) education.getSelectedItem();
            String soccupation = (String) occupation.getSelectedItem();
            String seniorcitizen = null;
            if(syes.isSelected()){
                seniorcitizen = "Yes";
            }
            else if(sno.isSelected()){
                seniorcitizen = "No";
            }

            String exisitingaccount = null;
            if(eyes.isSelected()){
                exisitingaccount = "Yes";
            }
            else if(eno.isSelected()){
                exisitingaccount = "No"; 
        }
           
            String span = pan.getText();
            String saadhar = aadhar.getText();
            
            
            try{
               
                    Conn c = new Conn();
                    String query = "insert into signupTwo values('"+formno+"', '"+ sreligion+ "', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"','"+saadhar+"','"+exisitingaccount+"','"+ seniorcitizen +"')" ; // insert (dml command)
                    c.s.executeUpdate(query);
                // signup 3 object
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
    }
    public static void main(String[] args){
        new SignupTwo("");
    }
    
}
