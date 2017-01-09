/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class Connector {
    
    private final String USER = "root";
    private final String PASS = "root";
    private final String URL = "jdbc:derby://localhost:1527:Usuarios";
    private final Connection conn;
    
    
    public Connector(){
        this.conn = initConn();
    }
    
    private Connection initConn() {

        Driver myDriver;
        try {
            myDriver = new org.apache.derby.jdbc.EmbeddedDriver();
            DriverManager.registerDriver(myDriver);
            Connection connAux = DriverManager.getConnection(URL, USER, PASS);
            return connAux;
        } catch (SQLException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);

        }
        
        return null;
    }
    
    public void  closeConn(){
    
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
