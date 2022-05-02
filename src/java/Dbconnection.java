/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonardo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public final class Dbconnection{
    public static Connection ConnectDatabase() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://uoggwhue2lrj4qyt:nNHbPBJBYyf5abhrEice@bysp8oufbeprslc9nfpj-mysql.services.clever-cloud.com:3306/bysp8oufbeprslc9nfpj");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Connected"); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return con;
    }
    
    public static void Query() {
        
    }
    
    
        
}

