/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author sunil
 */
public class ConnectionProvider {
    public static  Connection getCon(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("JDBC:mysql://localhost:3306/pharmacy?useSSLp=false","root","sunil@9834");
        return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
