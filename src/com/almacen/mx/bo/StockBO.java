package com.almacen.mx.bo;

import com.almacen.mx.dao.StockDAO;
import com.almacen.mx.db.Conexion;
import com.almacen.mx.entity.Entrada;
import com.almacen.mx.entity.Salida;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samuel
 */
public class StockBO {
    
        private String mensaje= "";
        private StockDAO sdao = new StockDAO();
    public String agregarSalida( Salida Salida)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sdao.agregarSalida(conn, Salida);
          
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
            
        }finally{
            try {
                if (conn != null) 
                {
                    conn.close();
                }
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String agregarEntrada(Entrada Entrada)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sdao.agregarEntrada(conn, Entrada);
          
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
            
        }finally{
            try {
                if (conn != null) 
                {
                    conn.close();
                }
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarSalida ( Salida Salida)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sdao.modificarSalida(conn, Salida);
          
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
            
        }finally{
            try {
                if (conn != null) 
                {
                    conn.close();
                }
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarEntrada (Entrada Entrada)
    {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sdao.modificarEntrada(conn, Entrada);
          
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
            
        }finally{
            try {
                if (conn != null) 
                {
                    conn.close();
                }
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public void listaStock(JTable tabla)
    {
        Connection conn = Conexion.getConnection();
        sdao.listaStock(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    public void listarEntradas(JTable tabla)
    {
        Connection conn = Conexion.getConnection();
        sdao.listarEntradas(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
    public void listarSalidas(JTable tabla)
    {
    Connection conn = Conexion.getConnection();
        sdao.listarSalidas(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
