package bank.management.system;

import java.util.*;
import java.sql.*;


public class Conn {
    Connection c;    // create object of connection
    Statement s;  // 3. create statement
    public Conn(){
        try {
           // Class.forName(com.mysql.cj.jdbc.Driver);   //1. register the driver
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Password@26");  //2. create Connection
            s = c.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
