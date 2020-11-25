/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import  java.sql.*;
/**
 *
 * @author shan
 */
public class DB {
    
    public static Connection createConnection()throws  Exception
    {

             Class.forName("org.sqlite.JDBC");       
            Connection con = DriverManager.getConnection("jdbc:sqlite:p44.db","root","");
          
          return con;
    }
   
    
}
