package management;

import java.sql.*;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  //can remove this line
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","sohail420"); // last root put password
            s =c.createStatement();



        }catch(Exception e){
            System.out.println(e);
        }
    }
}
