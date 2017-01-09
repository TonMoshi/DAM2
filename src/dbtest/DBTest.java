/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import Model.Connector;


/**
 *
 * @author dam2
 */
public class DBTest {

    

    /**
     * @param args the command line arguments

     */
    public static void main(String[] args){
        // TODO code application logic here
        
        Connector conn = new Connector();
        System.out.println("Conectado");
        conn.closeConn();
        System.out.println("Desconectado");

    }

    

}
