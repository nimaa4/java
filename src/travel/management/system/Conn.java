package travel.management.system;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","Nimanine9!"); 
            s =c.createStatement();   
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
