/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.washingmachineproject;
import java.sql.*;
/**
 *
 * @author oaits
 */
public class sqlConnection {
    Connection conn = null;
    
    public Connection connectdb(){
        try{
            Class.forName("oracle.jdbc.OracleDriver").newInstance(); //register jdbc driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.0.18.2:1521:orcl","moi01749", "moi01749");
            return conn;

        } catch (Exception e) {
            return null;
        }

    }
}
