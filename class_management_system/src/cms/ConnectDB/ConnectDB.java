/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lhl63
 */
public class ConnectDB {
     private static final String driver = "oracle.jdbc.driver.OracleDriver"; // JDBC Driver Class 
    private static final String url = "jdbc:oracle:thin:@sedb.deu.ac.kr:1521:orcl"; 
    private static final String user = "B20203155"; 
    private static final String pw = "20203155"; 
    
        
    public ConnectDB()  {
        try {
            Class.forName(driver); // JDBC 드라이버 로딩 
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }        
    }
    
    public Connection getConnection() throws SQLException {        
        return DriverManager.getConnection(url, user, pw);
    } 
}
