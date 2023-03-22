package com.almacen.mx.db;

import java.sql.*;

public class Conexion {
    public static Connection conectUser(String user, String password){
        String conexionUrl = "jdbc:sqlserver://localhost:1433;" +
                             "database = ALMACEN;" +
                             "user = " + user +";" +
                             "password = " + password +";"+
                             "loginTimeout = 20;" +
                             "TrustServerCertificate=True;";
        
        
        try {
            Connection con= DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException e) {
            return null;
        }
    }
}
